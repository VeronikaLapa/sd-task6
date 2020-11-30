import java.text.ParseException;
import java.util.List;

public class PrintVisitor implements TokenVisitor{
    private String result = "";

    public void visit(NumberToken token) {
        result += token.toString() + " ";
    }

    public void visit(Brace token) {
        result += token.toString() + " ";
    }

    public void visit(Operation token) {
        result += token.toString() + " ";
    }

    private String print(List<Token> tokens) throws ParseException {
        for (Token token: tokens) {
            token.accept(this);
        }
        return result;
    }

    static String printTokens(List<Token> tokens) throws ParseException {
        return new PrintVisitor().print(tokens);
    }
}
