import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void createFizzBuzzInstance() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void knowsIfDivisibleByThree() {
        assertEquals(fizzbuzz.isDivisibleByThree(3), true);
    }

    @Test
    public void knowsIfNotDivisibleByThree() {
        assertEquals(fizzbuzz.isDivisibleByThree(4), false);
    }

    @Test
    public void knowsIfDivisibleByFive() {
        assertEquals(fizzbuzz.isDivisibleByFive(5), true);
    }

    @Test
    public void knowsIfNotDivisibleByFive() {
        assertEquals(fizzbuzz.isDivisibleByFive(6), false);
    }

    @Test
    public void knowsIfDivisibleByFifteen() {
        assertEquals(fizzbuzz.isDivisibleByFifteen(15), true);
    }

    @Test
    public void knowsIfNotDivisibleByFifteen() {
        assertEquals(fizzbuzz.isDivisibleByFifteen(16), false);
    }

    @Test
    public void returnsFizzIfDivisibleByThree() {
        assertEquals(fizzbuzz.play(3), "Fizz");
    }




}