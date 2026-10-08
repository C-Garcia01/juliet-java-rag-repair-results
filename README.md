# Juliet Java: 10-CWE RAG repair results

This repository preserves the **exact original and generated repair commits** referenced in `results.csv`. All 20 commit hashes are unchanged from the local experiment. There is one selected Java testcase for each of 10 distinct CWEs.

**Status: generated, behaviorally unvalidated repairs.** The model proposed edits and the pipeline committed them. These results do not establish that each vulnerability is fixed or that legitimate behavior is preserved. The `fixed_commit` / `after_commit` fields name the generated repair snapshot, not a validated security fix.

## CSV files

- [results.csv](results.csv): the original experiment CSV, copied byte-for-byte.
- [results-linked.csv](results-linked.csv): the same rows and hashes, with clickable commit, source-file, and diff URLs added.
- [manifest.json](manifest.json): archive fingerprint, model, experiment status, and file/commit hashes.

The CSV's `evidence` paths resolve to per-case result reports in this repository. A `repair.patch` sits next to each report. Raw CLI sessions and credentials are not part of the export.

## Browse each pair

Each `cases/CWE-N` branch ends at the generated repair; its parent is the original vulnerable snapshot. Tags `original/CWE-N` and `repair/CWE-N` also point to the exact hashes. These histories were imported as Git objects, without rebasing, squashing, or recreating commits.

| CWE | Original snapshot | Generated repair | Changes |
| --- | --- | --- | --- |
| CWE-15 | [227e6c996fd4](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/227e6c996fd4a02d6b844b8ba758d802a22ba644) | [9e4574ac2c4c](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/9e4574ac2c4c25ce602972f9cb2c8b3dfbbefa3d) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/227e6c996fd4a02d6b844b8ba758d802a22ba644...9e4574ac2c4c25ce602972f9cb2c8b3dfbbefa3d) |
| CWE-78 | [07df28485fc2](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/07df28485fc2de1572a7f018012c4f05345c4974) | [0f98f0a99942](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/0f98f0a9994274b4ff2ac44ecd8edd99f5065ba3) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/07df28485fc2de1572a7f018012c4f05345c4974...0f98f0a9994274b4ff2ac44ecd8edd99f5065ba3) |
| CWE-80 | [42699d2024e0](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/42699d2024e0c4522f077f5ab9e7e20c7a452270) | [1755ec3b071f](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/1755ec3b071fdb957b5606f451da97341024ea7a) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/42699d2024e0c4522f077f5ab9e7e20c7a452270...1755ec3b071fdb957b5606f451da97341024ea7a) |
| CWE-81 | [5760633ed1f9](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/5760633ed1f9cb5127c4f397e7c52842c778fbf0) | [4c0768e3bada](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/4c0768e3badab7070fdace821278c77f5e445fc4) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/5760633ed1f9cb5127c4f397e7c52842c778fbf0...4c0768e3badab7070fdace821278c77f5e445fc4) |
| CWE-83 | [ec886f3639ea](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/ec886f3639ea6a5d83aa5cf53d7c3725f7e416d7) | [6ecc7e5a7e3d](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/6ecc7e5a7e3d7d83a08f9fc235bf967d6798d083) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/ec886f3639ea6a5d83aa5cf53d7c3725f7e416d7...6ecc7e5a7e3d7d83a08f9fc235bf967d6798d083) |
| CWE-89 | [86c083a0dfb8](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/86c083a0dfb8389e0c18f09676fffde1566f792a) | [6627c35ad72d](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/6627c35ad72dcc5e3fc7d7b56543eec36785428a) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/86c083a0dfb8389e0c18f09676fffde1566f792a...6627c35ad72dcc5e3fc7d7b56543eec36785428a) |
| CWE-113 | [1731f9570249](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/1731f95702495ffd190dbcdcdf8a9f50442f9e45) | [3c5736e56eae](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/3c5736e56eaef1d8035e25d0c6ec3e42bcdc3030) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/1731f95702495ffd190dbcdcdf8a9f50442f9e45...3c5736e56eaef1d8035e25d0c6ec3e42bcdc3030) |
| CWE-129 | [a19e3e523544](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/a19e3e523544cc34cd35e52f4507bb9b39502d6d) | [8d8d068b75f1](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/8d8d068b75f1b3159383963efe0cfe02174b07f7) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/a19e3e523544cc34cd35e52f4507bb9b39502d6d...8d8d068b75f1b3159383963efe0cfe02174b07f7) |
| CWE-134 | [863456e4288d](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/863456e4288d40da155a3c3c41eae52894ca9893) | [5d2476e4b49b](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/5d2476e4b49b12a5f00d0f3593a7206f34e2b2be) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/863456e4288d40da155a3c3c41eae52894ca9893...5d2476e4b49b12a5f00d0f3593a7206f34e2b2be) |
| CWE-606 | [8cf47810ca3a](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/8cf47810ca3a76bf7d4e29cf6196fb18cb70e9cf) | [b64b499b8b97](https://github.com/C-Garcia01/juliet-java-rag-repair-results/commit/b64b499b8b977655eecf8f4fc2be75a5de01dd09) | [diff](https://github.com/C-Garcia01/juliet-java-rag-repair-results/compare/8cf47810ca3a76bf7d4e29cf6196fb18cb70e9cf...b64b499b8b977655eecf8f4fc2be75a5de01dd09) |

## Look up a hash locally

```bash
git clone https://github.com/C-Garcia01/juliet-java-rag-repair-results.git
cd juliet-java-rag-repair-results
python3 verify_results.py
git show <before_commit>:<path>
git show <after_commit>:<path>
git diff <before_commit> <after_commit> -- <path>
```

Use complete hashes and the `path` column from either CSV. The verification script checks that the commits exist, each repair's parent is the original snapshot, and both file contents match the CSV's SHA-256 values. It does not execute the code or test security behavior.

## Provenance and method

- Source archive: `2017-10-01-juliet-test-suite-for-java-v1-3.zip` (Juliet Java 1.3).
- Archive SHA-256: `d985f4177c2bcd7b03455a05c1c8f2e755f55c9eb250accd052f05f877347e60`.
- Run: `juliet-20261008T050621Z-cfe8e9e0`.
- Generation: Claude Code subscription CLI, model `claude-opus-4-8`.
- Input adaptation: normalize line endings, remove supplied testcase comments and good implementations, retain empty `good()` compatibility stubs and original runtime support/dependencies.
- Direct repair: provide vulnerable source and runtime support, plus eligible reviewed RAG examples; apply returned edits to an isolated checkout and commit them.
- The reviewed corpus provided matching-CWE examples for 7 of the 10 cases. CWE-15, CWE-81, and CWE-83 used source context without retrieved examples.
- Three initial formatting failures were retried after changing JSON handling. The CSV and reports reference the final generated repairs.

The original hashes are **synthetic imported Juliet snapshots**, not historical real-project vulnerability-introducing commits. Each case history retains its `juliet-input.json` provenance and bundled dependency license/notice files under `lib/`. This export does not relicense those upstream materials.
