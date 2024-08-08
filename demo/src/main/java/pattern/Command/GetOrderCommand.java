package pattern.Command;

public class GetOrderCommand implements ICommand {
    protected Waiter objectToCommand;

    public GetOrderCommand(Waiter waiter) {
        this.objectToCommand = waiter;
    }

    @Override
    public void execute() {
        objectToCommand.getOrder();
    }

    @Override
    public void revert() {
        objectToCommand.revertGetOrder();
    }
}
