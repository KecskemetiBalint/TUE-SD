package pattern.Template;

import java.sql.Date;
import java.time.LocalDateTime;

public class Message {
    private final String message;
    private final LocalDateTime time;
    private final Label label;
    private final String location;

    public Message(String message, Label label, String location) {
        this.message = message;
        this.time = java.time.LocalDateTime.now();
        this.label = label;
        this.location = location;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Label getLabel() {
        return label;
    }

    public String getLocation() {
        return location;
    }     
}
