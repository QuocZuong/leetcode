import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                temp.push(c);
            }

            else if (c == ')' && !temp.isEmpty() && temp.peek() == '(') {
                temp.pop();
            }

            else if (c == ']' && !temp.isEmpty() && temp.peek() == '[') {
                temp.pop();
            }

            else if (c == '}' && !temp.isEmpty() && temp.peek() == '{') {
                temp.pop();
            } else {
                return false;
            }
        }
        return temp.isEmpty();
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
