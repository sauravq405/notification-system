package src.decorator;

import src.model.Message;

public abstract class NotificationDecorator implements Message {

    protected Message message;

    public NotificationDecorator(Message message) {

        this.message = message;
    }

}
