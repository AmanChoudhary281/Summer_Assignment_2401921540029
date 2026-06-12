import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String current = "";
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(current);
                k = 0;
                current = "";
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());

                for (int i = 0; i < count; i++) {
                    temp.append(current);
                }

                current = temp.toString();
            } else {
                current += ch;
            }
        }

        return current;
    }
}