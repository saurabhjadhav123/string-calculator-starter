package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_multiple_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("1,4"));
    }
    
    @Test
    void string_with_multiple_number_newline_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(11, stringCalculator.add("1,4\n6"));
    }
}
