# Java Basics lab

You finish six small methods in one Java file, `src/main/java/basics/Basics.java`.
Each method practises one idea from the Java Basics module: a primitive type, a String method, an operator, if/else, a switch expression and a for loop.

The full learner instructions are in [`.evolv/instructions.md`](.evolv/instructions.md), which the lab platform shows as the lab's instructions.

## Layout

This repository follows the Exa coding-lab scaffold for Java.

| Path | What it is |
|---|---|
| `src/main/java/basics/Basics.java` | The file learners edit: six methods marked `TODO` |
| `src/test/java/basics/BasicsTest.java` | The visible tests, one per task |
| `.evolv/instructions.md` | Learner instructions |
| `.evolv/grade.yml` | Grading manifest, used by Run Tests and by the grader |
| `pom.xml` | Maven build: Java 17 and JUnit 5.11.3, matching the scaffold |
| `Dockerfile` | Image for local Run Tests; warms the Maven cache |
| `expected/test-summary.txt` | The result of a finished lab |

There are no held-out tests in this lab: every test is visible.

## Run the tests

On the platform, select **Run Tests**. From a terminal with JDK 17 or later and Apache Maven 3.9:

```
mvn -q test
```

All 6 tests fail until the `TODO`s are done. That is expected.
