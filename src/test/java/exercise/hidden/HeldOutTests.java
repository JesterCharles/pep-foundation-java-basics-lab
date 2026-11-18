package exercise.hidden;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import exercise.Basics;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/** Held-out tests: graded on submit, never shown to the learner. Edge cases for every task. */
@TestMethodOrder(MethodOrderer.MethodName.class)
class HeldOutTests {

    @Test
    void task1AverageEdgeCases() {
        assertAll(
                () -> assertEquals(-2.5, Basics.average(-3, -2), "Task 1: average(-3, -2)"),
                () -> assertEquals(2.0E9, Basics.average(2_000_000_000, 2_000_000_000),
                        "Task 1: average(2000000000, 2000000000), where a + b does not fit in an int"));
    }

    @Test
    void task2InitialsEdgeCases() {
        assertEquals("XY", Basics.initials("x", "y"), "Task 2: initials(\"x\", \"y\")");
    }

    @Test
    void task3EvenEdgeCases() {
        assertAll(
                () -> assertEquals(true, Basics.isEven(-4), "Task 3: isEven(-4)"),
                () -> assertEquals(false, Basics.isEven(-3), "Task 3: isEven(-3)"));
    }

    @Test
    void task4GradeEdgeCases() {
        assertAll(
                () -> assertEquals("A", Basics.grade(90), "Task 4: grade(90)"),
                () -> assertEquals("B", Basics.grade(80), "Task 4: grade(80)"),
                () -> assertEquals("C", Basics.grade(70), "Task 4: grade(70)"),
                () -> assertEquals("F", Basics.grade(0), "Task 4: grade(0)"));
    }

    @Test
    void task5DayEdgeCases() {
        assertAll(
                () -> assertEquals("weekday", Basics.dayType(5), "Task 5: dayType(5)"),
                () -> assertEquals("weekend", Basics.dayType(7), "Task 5: dayType(7)"),
                () -> assertEquals("unknown", Basics.dayType(0), "Task 5: dayType(0)"));
    }

    @Test
    void task6CountdownEdgeCases() {
        assertAll(
                () -> assertEquals("1", Basics.countdown(1), "Task 6: countdown(1)"),
                () -> assertEquals("", Basics.countdown(0), "Task 6: countdown(0)"));
    }
}
