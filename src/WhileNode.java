import java.util.ArrayList;

public class WhileNode extends StatementNode {
    //While (booleanExpression and collection of statementNodes)
    private Node booleanExpression;
    private ArrayList<StatementNode> statementNodes;

    public WhileNode(Node booleanExpression, ArrayList<StatementNode> statementNodes) {
        super("while", statementNodes);
        this.booleanExpression = booleanExpression;
        this.statementNodes = statementNodes;
    }


    @Override
    public String toString() {
        return "While: " + booleanExpression.toString() + " Do: " + statementNodes.toString();
    }
}