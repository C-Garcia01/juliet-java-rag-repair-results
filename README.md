# Juliet Java: 305 generated repair pairs

This dataset contains **305 completed original/repair pairs across 112 CWEs** from Juliet Java 1.3. Each pair includes the original vulnerable source, a model-generated repair, exact Git commit hashes, a patch, and a generation report.

Generation is complete for all 305 included cases. Repairs are labeled **generated_unvalidated**: compilation and behavioral validation were not run. Original commits are synthetic Juliet snapshots, not historical vulnerability-introducing commits.

## Browse the data

- [results-linked.csv](results-linked.csv): all 305 pairs with clickable original/repair commits, files, and diffs.
- [results.csv](results.csv): the same 305 pairs without added URL columns.
- [pairs.csv](pairs.csv): the completed-pair export, identical to results.csv.
- [inventory.json](inventory.json): the 305 included cases and source archive members.
- [manifest.json](manifest.json): scope, model, checksums, and counts.
- `reports/<case>/attempt-N/`: the accepted generation report, proposal, patch, and source pair.

## How the pairs were created

The importer grouped companion Java files, removed supplied good implementations and comments, and retained vulnerable entry points, shared helpers, and runtime support. Each adapted testcase became an original Git commit. Claude Code (`claude-opus-4-8`) generated structured edits, which were checked for valid format and application before being committed.

Matching reviewed examples were retrieved for 21 cases. The other 284 used source context without matching retrieval examples. Coverage is one pair for 12 CWEs, two for 10, three for 87, and four for three.

Every before/after file SHA-256 and repair-parent relationship was verified. The original and repair commit hashes are unchanged. Histories are preserved through `cases/juliet-305/<case>` branches and `original/juliet-305/<case>` / `repair/juliet-305/<case>` tags.

## Verify and inspect

```bash
git clone --branch juliet-305 https://github.com/C-Garcia01/juliet-java-rag-repair-results.git
cd juliet-java-rag-repair-results
python verify_results.py
git show HASH:path/to/File.java
```

Hash verification establishes data integrity, not repair correctness. These are candidate repairs for review and evaluation. Similar Juliet flow variants should be grouped when splitting training and test data to avoid leakage.

## CSV columns

| Column | Meaning |
| --- | --- |
| case_id | Grouped Juliet testcase identifier. |
| cwe | Weakness classification supplied by Juliet. |
| status | generated_unvalidated for every included pair. |
| before_commit | Original adapted vulnerable snapshot Git SHA; synthetic, not historical VCC. |
| after_commit | Generated repair Git SHA; for the generated repair. |
| path | Changed file path inside the testcase Git tree. |
| before_sha256 | SHA-256 of the original file bytes. |
| after_sha256 | SHA-256 of generated file bytes. |
| provider | Generation backend, claude CLI. |
| model | Requested model identifier. |
| retrieved_examples | JSON list of retrieved example IDs; may be empty. |
| historical_vcc | Always false for this synthetic dataset. |
| review_status | not_reviewed; no human correctness assessment. |
| validation_scope | not_run; no compilation or behavioral validation. |
| reason | Empty for these completed generations. |
| evidence | Relative path to the attempt's result report. |


## Added link columns in results-linked.csv

| Column | Meaning |
| --- | --- |
| original_commit_url | GitHub page for the original synthetic snapshot. |
| repair_commit_url | GitHub page for the generated repair commit. |
| original_file_url | Original file at its exact commit. |
| repair_file_url | Generated file at its exact commit. |
| diff_url | GitHub comparison between the two commits. |

Retain `generated_unvalidated` and `not_run` labels when using or sharing the data.
