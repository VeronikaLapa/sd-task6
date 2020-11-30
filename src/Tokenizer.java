import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

class Tokenizer {
    static List<Token> parseString(String s) throws ParseException {
        List<Token> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i++);
            if (Character.isSpaceChar(c)) {
                continue;
            }
            if (Character.isDigit(c)) {
                StringBuilder acc = new StringBuilder("" + c);
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    acc.append(s.charAt(i++));
                }
                result.add(new NumberToken(Integer.valueOf(acc.toString())));
            } else if (c == '*' || c == '/' || c == '+' || c == '-') {
                result.add(new Operation(c));
            } else if (c == '(' || c == ')') {
                result.add(new Brace(c));
            } else {
                throw new ParseException("Unknown symbol " + c + " at index " + i, i);
            }

        }
        return result;
    }
}
