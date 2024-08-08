package pattern.Exams.e201608;

public class Op1Command extends Command<Void> {
    String argToPass;

    public Op1Command(final Receiver receiver, String argToPass) {
        super(receiver);
        this.argToPass = argToPass;
    }

    @Override
    public Void execute() {
        receiver.operation1(argToPass);
        return (Void)null;
    }
}
