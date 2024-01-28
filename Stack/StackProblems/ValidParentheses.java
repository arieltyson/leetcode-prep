package Stack.StackProblems;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {

        if (s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false;
        if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;

        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                brackets.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !brackets.isEmpty() && brackets.peek() == '(') {
                brackets.pop();
            } else if (s.charAt(i) == '}' && !brackets.isEmpty() && brackets.peek() == '{') {
                brackets.pop();
            } else if (s.charAt(i) == ']' && !brackets.isEmpty() && brackets.peek() == '[') {
                brackets.pop();
            } else {
                brackets.push(s.charAt(i));
            }
        }
        return brackets.isEmpty();
    }
}
