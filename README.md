# Java Basics lab

You finish six small methods in one Java file, `Basics.java`.
Each method practises one idea from the Java Basics module: a primitive type, a String method, an operator, if/else, a switch expression and a for loop.

## Quick start

The lab needs JDK 25 and Apache Maven 3.9 or later in the terminal. Troubleshooting shows how to check.

1. Open the lab project you were given in VS Code, then open its integrated terminal: **Terminal > New Terminal**.
2. Go into the project folder. Every command in this lab runs there:

   ```
   cd starter
   ```

3. Before the first test run, download the lab's libraries once. This needs the internet, and prints nothing when it works:

   ```
   mvn -q dependency:go-offline
   ```

4. Run the tests before you change anything:

   ```
   mvn -q -o test
   ```

   **All 6 tests fail at first. That is expected: the TODOs are not done yet.**
   The output ends with `Tests run: 6, Failures: 6`, and every failure line starts with its task number, such as `Task 1:`.
5. Work through the checklist below. After each task, run `mvn -q -o test` again and read the remaining `Task N:` lines.
6. **You are finished when `mvn -q -o test` prints nothing at all.**

```
OPEN project -> cd starter -> setup (once) -> RUN tests: 6 fail (expected)
  -> READ the "Task N:" lines -> EDIT the next TODO -> RUN tests again
  -> repeat for Tasks 1-6 -> STOP when the test run prints nothing
```

In words: open the project, run the tests, read which tasks fail, complete one task's TODO, run the tests again, and stop when they print nothing.

## Checklist

All six tasks are in `starter/src/main/java/basics/Basics.java`. Each one is a method with a `TODO` comment.

- [ ] Task 1: `average` (primitive types)
- [ ] Task 2: `initials` (String methods)
- [ ] Task 3: `isEven` (the remainder operator)
- [ ] Task 4: `grade` (if / else if / else)
- [ ] Task 5: `dayType` (a switch expression)
- [ ] Task 6: `countdown` (a for loop)

A task is done when no failure line starts with its number.
Edit only `Basics.java`. The tests in `tests/basics/`, the build file `starter/pom.xml` and `expected/test-summary.txt` stay as they are.

## Task steps

Each method's `TODO` comment says what it must return.
Work each result out from the method's parameters, using the idea the task names.
The tests call every method with several inputs, including edge cases, and check only the results. They cannot see how you computed them, so the practice comes from writing the general code yourself.
You can do the tasks in any order.

### Task 1: average

1. Find the method `average(int a, int b)` and its `TODO`.
2. Replace `return 0;` with code that returns the average of `a` and `b`, keeping the fraction. Think about what integer division does, and about two very large `int` values.
3. While the method is wrong, you see lines such as `Task 1: average(90, 85) ==> expected: <87.5> but was: <0.0>`.

### Task 2: initials

1. Find the method `initials(String first, String last)`.
2. Return the first letter of each name, in upper case, using String methods.
3. While it is wrong, you see lines such as `Task 2: initials("Grace", "hopper") ==> expected: <GH> but was: <>`.

### Task 3: even numbers

1. Find the method `isEven(int n)`.
2. Return whether `n` is even, using the remainder operator `%`. Check your idea against negative numbers too.
3. While it is wrong, you see lines such as `Task 3: isEven(7)`.

### Task 4: grade

1. Find the method `grade(int score)`.
2. Choose the grade with an `if`, `else if` and `else` chain, using the thresholds in the method's comment. Think about which condition must come first.
3. The tests try the scores on both sides of every threshold. While a branch is wrong, you see lines such as `Task 4: grade(89) ==> expected: <B> but was: <?>`.

### Task 5: day type

1. Find the method `dayType(int day)`.
2. Return the result of a switch expression with arrow labels (`->`), covering the values in the method's comment and every other value.
3. While it is wrong, you see lines such as `Task 5: dayType(8)`.

### Task 6: countdown

1. Find the method `countdown(int n)`.
2. Build the text with a `for` loop, from `n` down to 1, with single spaces between the numbers and none at the ends. Check what your loop does when `n` is 0.
3. While it is wrong, you see lines such as `Task 6: countdown(3) ==> expected: <3 2 1> but was: <>`.

### About the test results

A passing run shows that each method returns the right results for the inputs the tests try.
It does not check which Java constructs your code uses, so compare your code with each task's steps yourself.

## Run the program

The program prints one line per task. From `starter`:

```
mvn -q -o compile
java -cp target/classes basics.Basics
```

`expected/test-summary.txt` shows the finished result, including the six lines this program prints.

## Troubleshooting

- **`there is no POM in this directory`.** The terminal is not in `starter`. From the lab folder, run `cd starter` and try again.
- **`COMPILATION ERROR`.** Your code does not compile yet. Maven names the file, then `[line,column]`, then the problem. Fix that line and run the tests again.
- **`mvn: command not found`, or `'mvn' is not recognized`.** Maven's `bin` folder is not on your `PATH`. Add it, then open a new terminal.
- **`mvn -v` shows a Java version other than 25, or you see `release version 25 not supported`.** Maven uses the JDK named by `JAVA_HOME` when it is set, otherwise the `java` on your `PATH`. Set `JAVA_HOME` to your JDK 25 folder, or unset it, then open a new terminal. Check with `java -version` and `mvn -v`.
- **`Cannot access central in offline mode`, or a missing artifact.** The setup step has not finished. Run `mvn -q dependency:go-offline` once while online.

## Cleanup (optional)

Maven writes only the `starter/target` folder, and Git already ignores it.
To delete it, run `rm -rf target` from `starter`. In Windows PowerShell, run `Remove-Item -Recurse -Force target`.
