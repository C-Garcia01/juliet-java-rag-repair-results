"""Verify each exported pair against this repository's exact Git objects."""
import csv
import hashlib
from pathlib import Path
import subprocess

root = Path(__file__).resolve().parent
rows = list(csv.DictReader((root / 'pairs.csv').open(newline='')))
for row in rows:
    parent = subprocess.check_output(['git', '-C', str(root), 'rev-parse', row['after_commit'] + '^'], text=True).strip()
    assert parent == row['before_commit'], ('parent mismatch', row['case_id'])
    for prefix, commit in [('before', row['before_commit']), ('after', row['after_commit'])]:
        blob = subprocess.check_output(['git', '-C', str(root), 'show', commit + ':' + row['path']])
        assert hashlib.sha256(blob).hexdigest() == row[prefix + '_sha256'], ('blob mismatch', row['case_id'], prefix)
    assert row['status'] == 'generated_unvalidated'
    assert row['validation_scope'] == 'not_run'
print(f'Verified {len(rows)} generated file pairs. This checks integrity, not repair correctness.')
