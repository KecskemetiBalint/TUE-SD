package pattern.Template;

public class TemplateClient {

    public static void run() {
        ConsoleLogger consl = new ConsoleLogger(new TimeFormatter());
        Message msg = new Message("senkihazi üzenet", Label.ERROR, "itten");
        consl.logMsg(msg);

    }

}
