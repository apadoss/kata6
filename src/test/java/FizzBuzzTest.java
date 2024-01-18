import org.junit.Test;
import software.ulpgc.kata6.FizzBuzz;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_number_given_non_divisible_by_3_nor_by_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        assertEquals("1", fizzBuzz.compute());
    }
}