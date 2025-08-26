package src.decorator;

import src.model.Message;

public class TimestampedMessage extends NotificationDecorator {

    public TimestampedMessage(Message message) {

        super(message);

    }
    public String getContent() {

        return message.getContent() + " @ " + java.time.LocalDateTime.now();

    }

}
