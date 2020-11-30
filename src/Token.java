import java.text.ParseException;

public interface Token {
    enum TokenType {ADD, SUB, MUL, DIV, LEFT, RIGHT, NUM}

    void accept(TokenVisitor visitor) throws ParseException;
    TokenType getTokenType();

}
