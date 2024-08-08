package pattern.Command;

public class DeliverOrderCommand implements ICommand {
    protected Waiter objectToCommand;

    public DeliverOrderCommand(Waiter waiter) {
        this.objectToCommand = waiter;
    }

    @Override
    public void execute() {
        objectToCommand.deliverOrder();
    }

    @Override
    public void revert() {
        objectToCommand.revertDeliverOrder();
    }
}