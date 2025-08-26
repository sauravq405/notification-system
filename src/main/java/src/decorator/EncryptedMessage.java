package src.decorator;

import src.model.Message;

public class EncryptedMessage extends NotificationDecorator {

    public EncryptedMessage(Message message) {

        super(message);

    }
    public String getContent() {

        return "[Encrypted] " + message.getContent();

    }

}
