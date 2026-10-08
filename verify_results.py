"""Verify published commit and file hashes without executing testcase code."""
import csv
import hashlib
from pathlib import Path
import subprocess


ROOT = Path(__file__).resolve().parent


def git(*args):
    return subprocess.check_output(
        ['git', '-c', 'core.hooksPath=/dev/null', '-C', str(ROOT), *args])


def main():
    with (ROOT / 'results.csv').open(newline='', encoding='utf-8') as stream:
        rows = list(csv.DictReader(stream))
    if len(rows) != 10 or len({r['cwe'] for r in rows}) != 10:
        raise ValueError('Expected exactly 10 rows from 10 unique CWEs')
    for row in rows:
        before, after = row['before_commit'], row['after_commit']
        git('cat-file', '-e', before + '^{commit}')
        git('cat-file', '-e', after + '^{commit}')
        if git('rev-parse', after + '^').decode().strip() != before:
            raise ValueError(f"{row['cwe']}: repair parent does not match original hash")
        for revision, field in [(before, 'before_sha256'), (after, 'after_sha256')]:
            content = git('show', revision + ':' + row['path'])
            if hashlib.sha256(content).hexdigest() != row[field]:
                raise ValueError(f"{row['cwe']}: {field} mismatch")
        if not (ROOT / row['evidence']).is_file():
            raise ValueError(f"{row['cwe']}: missing result report")
        print(f"{row['cwe']}: both commits and file hashes verified")
    print('All 10 pairs verified. Behavioral correctness has not been evaluated.')


if __name__ == '__main__':
    main()
