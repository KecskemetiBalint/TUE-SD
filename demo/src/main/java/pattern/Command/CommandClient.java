package pattern.Command;

import java.util.ArrayList;
import java.util.Stack;

public class CommandClient {
    public static void run() {
        Waiter waiter = new Waiter();
        ArrayList<ICommand> list = new ArrayList<ICommand>();
        list.add(new GetOrderCommand(waiter));
        list.add(new DeliverOrderCommand(waiter));
        for (ICommand iCommand : list) {
            iCommand.execute();
        }
        Stack<ICommand> stack = new Stack<ICommand>();
        ICommand command = new GetOrderCommand(waiter);
        command.execute();
        stack.push(command);
        command = new DeliverOrderCommand(waiter);
        command.execute();
        stack.push(command);
        command = stack.pop();
        command.revert();
    }
}
