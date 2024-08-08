package pattern.Template;

public class ConsoleLogger extends LoggerTemplate {

    public ConsoleLogger(MessageFormatter formatter) {
        super(formatter);
    }

    @Override
    protected void write(String formattedMsg) {
        System.out.println(formattedMsg);
    }
}
