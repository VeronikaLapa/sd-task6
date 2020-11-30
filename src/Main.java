import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String expr = in.nextLine();
        try {
            List<Token> tokens = Tokenizer.parseString(expr);
            List<Token> RPNTokens = ParserVisitor.parseToRPN(tokens);
            System.out.println(PrintVisitor.printTokens(tokens));
            System.out.println(PrintVisitor.printTokens(RPNTokens));
            int result = CalcVisitor.evaluateExpression(RPNTokens);
            System.out.println("result = " + result);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
