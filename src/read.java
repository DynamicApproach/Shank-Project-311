import java.util.ArrayList;

public class read extends BuiltInFunctionNode {
    public read(String name, ArrayList<FuctionNode> arguments, boolean varadic) {
        super(name, arguments, varadic);
    }

    @Override
    public void execute(ArrayList<InterpreterDataType> arguments) throws Exception {
        // TODO: execute the read function?
        //
        //  new thread for fun for now
        new Thread(new Runnable() {
            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("read");
            }
        }).start();

    }
}
