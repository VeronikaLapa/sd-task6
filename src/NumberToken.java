public class NumberToken implements Token {
    private int value;

    NumberToken(int value) {
        this.value = value;
    }

    @Override
    public void accept(TokenVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public TokenType getTokenType() {
        return TokenType.NUM;
    }

    @Override
    public String toString() {
        return "NUMBER(" + value + ")";
    }

    int getValue() {
        return value;
    }
}
