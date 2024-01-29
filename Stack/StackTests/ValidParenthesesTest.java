package Stack.StackTests;

import Stack.StackProblems.ValidParentheses;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    public void testIsValid() {
        ValidParentheses validParentheses = new ValidParentheses();

        // Test with valid parentheses
        assertTrue(validParentheses.isValid("(){}[]"));
        assertTrue(validParentheses.isValid("{[]}"));
        assertTrue(validParentheses.isValid(""));

        // Test with invalid parentheses
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
        assertFalse(validParentheses.isValid("{[}"));
    }
}
