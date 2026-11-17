# Java Basics lab

You finish six small methods in one Java file, `Basics.java`.
Each method practises one idea from the Java Basics module: a primitive type, a String method, an operator, if/else, a switch expression and a for loop.

## Quick start

1. Open `src/main/java/exercise/Basics.java`. Each task is a method with a `TODO` comment.
2. Select **Run Tests** before you change anything.

   **All 6 tests fail at first. That is expected: the TODOs are not done yet.**
   Every failure message starts with its task number, such as `Task 1:`.
3. Work through the checklist below. After each task, select **Run Tests** again and read the remaining `Task N:` messages.
4. **You are finished when all 6 tests pass.** Then select **Submit**.

```
OPEN Basics.java -> RUN TESTS: 6 fail (expected)
  -> READ the "Task N:" messages -> EDIT the next TODO -> RUN TESTS again
  -> repeat for Tasks 1-6 -> SUBMIT when all 6 tests pass
```

In words: open the file, run the tests, read which tasks fail, complete one task's TODO, run the tests again, and submit when they all pass.

## Checklist

All six tasks are in `src/main/java/exercise/Basics.java`. Each one is a method with a `TODO` comment.

- [ ] Task 1: `average` (primitive types)
- [ ] Task 2: `initials` (String methods)
- [ ] Task 3: `isEven` (the remainder operator)
- [ ] Task 4: `grade` (if / else if / else)
- [ ] Task 5: `dayType` (a switch expression)
- [ ] Task 6: `countdown` (a for loop)

A task is done when no failure message starts with its number.
Edit only `Basics.java`. The tests in `src/test/java/exercise/` are restored to their original state before your work is graded, so changes to them do not count. Leave the build file `pom.xml` as it is.

## Task steps

Each method's `TODO` comment says what it must return.
Work each result out from the method's parameters, using the idea the task names.
The tests call every method with several inputs, including edge cases, and check only the results. They cannot see how you computed them, so the practice comes from writing the general code yourself.
You can do the tasks in any order.

### Task 1: average

1. Find the method `average(int a, int b)` and its `TODO`.
2. Replace `return 0;` with code that returns the average of `a` and `b`, keeping the fraction.
3. While the method is wrong, you see messages such as `Task 1: average(90, 85) ==> expected: <87.5> but was: <0.0>`.

<details><summary>Hint</summary>

Think about what integer division does, and about two very large `int` values.

</details>

### Task 2: initials

1. Find the method `initials(String first, String last)`.
2. Return the first letter of each name, in upper case, using String methods.
3. While it is wrong, you see messages such as `Task 2: initials("Grace", "hopper") ==> expected: <GH> but was: <>`.

### Task 3: even numbers

1. Find the method `isEven(int n)`.
2. Return whether `n` is even, using the remainder operator `%`.
3. While it is wrong, you see messages such as `Task 3: isEven(7)`.

<details><summary>Hint</summary>

Check your idea against negative numbers too.

</details>

### Task 4: grade

1. Find the method `grade(int score)`.
2. Choose the grade with an `if`, `else if` and `else` chain, using the thresholds in the method's comment.
3. The tests try the scores on both sides of every threshold. While a branch is wrong, you see messages such as `Task 4: grade(89) ==> expected: <B> but was: <?>`.

<details><summary>Hint</summary>

Think about which condition must come first.

</details>

### Task 5: day type

1. Find the method `dayType(int day)`.
2. Return the result of a switch expression with arrow labels (`->`), covering the values in the method's comment and every other value.
3. While it is wrong, you see messages such as `Task 5: dayType(8)`.

### Task 6: countdown

1. Find the method `countdown(int n)`.
2. Build the text with a `for` loop, from `n` down to 1, with single spaces between the numbers and none at the ends.
3. While it is wrong, you see messages such as `Task 6: countdown(3) ==> expected: <3 2 1> but was: <>`.

<details><summary>Hint</summary>

Check what your loop does when `n` is 0.

</details>

### About the test results

A passing run shows that each method returns the right results for the inputs the tests try.
It does not check which Java constructs your code uses, so compare your code with each task's steps yourself.

## Run the program (optional)

The program prints one line per task. In a terminal, from the project folder:

```
mvn -q compile
java -cp target/classes exercise.Basics
```

`expected/test-summary.txt` shows the finished result, including the six lines this program prints.

## Troubleshooting

- **`COMPILATION ERROR`.** Your code does not compile yet. Maven names the file, then `[line,column]`, then the problem. Fix that line and run the tests again.
