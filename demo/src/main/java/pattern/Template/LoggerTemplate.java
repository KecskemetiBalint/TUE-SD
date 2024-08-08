package pattern.Template;

public abstract class LoggerTemplate {
    protected Message msg;
    private MessageFormatter formatter;

    public LoggerTemplate(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void logMsg(Message msg) {
        this.msg = msg;
        String formattedMsg = formatter.format(msg);
        write(formattedMsg);
    }

    protected abstract void write(String formattedMsg);
}