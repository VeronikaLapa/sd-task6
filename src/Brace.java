import java.text.ParseException;

public class Brace implements Token {

    private TokenType type;

    Brace(char c) {
        if (c == '(') {
            type = TokenType.LEFT;
        } else {
            type = TokenType.RIGHT;
        }
    }

    @Override
    public void accept(TokenVisitor visitor) throws ParseException {
        visitor.visit(this);
    }

    @Override
    public TokenType getTokenType() {
        return type;
    }

    @Override
    public String toString() {
        if (type == TokenType.LEFT) {
            return "LEFT";
        }
        return "RIGHT";
    }
}
