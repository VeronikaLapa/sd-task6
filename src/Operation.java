public class Operation implements Token {
    private TokenType type;

    Operation(char c) {
        switch (c) {
            case '+':
                type = TokenType.ADD;
                break;
            case '-':
                type = TokenType.SUB;
                break;
            case '*':
                type = TokenType.MUL;
                break;
            case '/':
                type = TokenType.DIV;
                break;
        }
    }

    public void accept(TokenVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        if (type == TokenType.ADD) {
            return "ADD";
        } else if (type == TokenType.SUB) {
            return "SUB";
        } else if (type == TokenType.MUL) {
            return "MUL";
        } else {
            return "DIV";
        }
    }
    @Override
    public TokenType getTokenType() {
        return type;
    }
}
