package pattern.Exams.e201608;

public class Op2Command extends Command<String> {

    public Op2Command(final Receiver receiver) {
        super(receiver);
    }

    @Override
    public String execute() {
        return receiver.operation2();    
    }
}
