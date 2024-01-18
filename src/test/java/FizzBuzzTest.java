import org.junit.Test;
import software.ulpgc.kata6.FizzBuzz;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_number_given_non_divisible_by_3_nor_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals("1", fizzBuzz.compute());
    }

    @Test
    public void should_return_fizz_given_divisible_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        assertEquals("Fizz", fizzBuzz.compute());
    }

    @Test
    public void should_return_buzz_given_divisible_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        assertEquals("Buzz", fizzBuzz.compute());
    }

    @Test
    public void should_return_fizzbuzz_given_divisible_by_3_and_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        assertEquals("Fizzbuzz", fizzBuzz.compute());
    }
}
