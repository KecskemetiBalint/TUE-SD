package pattern.Template;

public class TimeFormatter implements MessageFormatter {
    @Override
    public String format(Message msg) {
        return String.format("%s: %s --- %s", msg.getLabel(), msg.getTime().toString(), msg.getMessage());
    }
}
