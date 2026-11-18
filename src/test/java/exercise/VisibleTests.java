package exercise;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * Visible tests for the Java Basics lab: one test per task. Each test calls one
 * method with a few inputs and checks only the results it returns.
 * Restored over the learner's checkout at grade time.
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
class VisibleTests {

    @Test
    void task1Average() {
        assertAll(
                () -> assertEquals(87.5, Basics.average(90, 85), "Task 1: average(90, 85)"),
                () -> assertEquals(1.5, Basics.average(1, 2), "Task 1: average(1, 2)"),
                () -> assertEquals(0.0, Basics.average(0, 0), "Task 1: average(0, 0)"));
    }

    @Test
    void task2Initials() {
        assertAll(
                () -> assertEquals("AL", Basics.initials("ada", "lovelace"), "Task 2: initials(\"ada\", \"lovelace\")"),
                () -> assertEquals("GH", Basics.initials("Grace", "hopper"), "Task 2: initials(\"Grace\", \"hopper\")"));
    }

    @Test
    void task3Even() {
        assertAll(
                () -> assertEquals(true, Basics.isEven(42), "Task 3: isEven(42)"),
                () -> assertEquals(false, Basics.isEven(7), "Task 3: isEven(7)"),
                () -> assertEquals(true, Basics.isEven(0), "Task 3: isEven(0)"));
    }

    @Test
    void task4Grade() {
        assertAll(
                () -> assertEquals("A", Basics.grade(100), "Task 4: grade(100)"),
                () -> assertEquals("B", Basics.grade(89), "Task 4: grade(89)"),
                () -> assertEquals("C", Basics.grade(79), "Task 4: grade(79)"),
                () -> assertEquals("F", Basics.grade(69), "Task 4: grade(69)"));
    }

    @Test
    void task5Day() {
        assertAll(
                () -> assertEquals("weekday", Basics.dayType(1), "Task 5: dayType(1)"),
                () -> assertEquals("weekend", Basics.dayType(6), "Task 5: dayType(6)"),
                () -> assertEquals("unknown", Basics.dayType(8), "Task 5: dayType(8)"));
    }

    @Test
    void task6Countdown() {
        assertAll(
                () -> assertEquals("5 4 3 2 1", Basics.countdown(5), "Task 6: countdown(5)"),
                () -> assertEquals("3 2 1", Basics.countdown(3), "Task 6: countdown(3)"));
    }
}
