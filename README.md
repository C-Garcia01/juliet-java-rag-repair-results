# Juliet input for automated repair

This is a synthetic Juliet Java 1.3 testcase, not a historical VCC.
The target is the original bad entry point and its companions under src/testcases/.
Reference good implementations are excluded; good() stubs only satisfy the abstract base contract.
Generate functional/security probes that call bad directly; do not use the good stubs.
Original support is in src/testcasesupport/, original dependency jars/licenses in lib/.
IO database connection settings are originally empty. If the case requires a database or other
service, prepare the environment or report the specific blocker; do not claim mock sinks
establish exploitability in a real deployed service. Do not disable the original bad behavior
during preparation. No target-specific fix or hand-written harness is provided.
