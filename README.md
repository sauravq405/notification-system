
# Java Notification System

This project demonstrates how to build a flexible and maintainable notification system in Java using several object-oriented design patterns. It supports different notification types (Email, SMS, Push) and allows dynamic selection of sending mechanisms at runtime.

### Project Structure

The system utilizes the following design patterns:

- **Factory Pattern**: For creating different types of notifications (Email, SMS, Push).
- **Strategy Pattern**: For selecting the sending mechanism at runtime.
- **Singleton Pattern**: To ensure a global instance of the notification manager.
- **Observer Pattern**: To notify listeners (like loggers or analytics) when a notification is sent.
- **Decorator Pattern**: For dynamically enhancing message content (e.g., adding encryption or timestamps).

### Features

- **Flexible Notification Types**: Supports multiple notification types such as Email, SMS, and Push.
- **Dynamic Sending Mechanism**: Choose between immediate or delayed sending strategies.
- **Message Enhancement**: Add features like encryption and timestamps using decorators.
- **Global Manager**: Ensures only one instance of the notification manager using the Singleton pattern.
- **Observer Support**: Allows adding observers (e.g., Logger, Analytics) to track notifications.

---

### Prerequisites

- Java 11 or higher
- IDE (e.g., IntelliJ IDEA, Eclipse)

---

### Project Setup

1. **Create a New Java Project** in your IDE:
   - Open IntelliJ IDEA or Eclipse and create a new Java project.
   - Select Java 11 or higher as the project SDK.
   - Name the project `notification-system`.

2. **Create the Project Structure**:
   - Create the following packages under `src`:
     - `model`
     - `decorator`
     - `factory`
     - `notification`
     - `strategy`
     - `singleton`
     - `observer`

3. **Add the Classes** as described below:
   - **model**: `Message.java`
   - **decorator**: `NotificationDecorator.java`, `EncryptedMessage.java`, `TimestampedMessage.java`
   - **factory**: `NotificationFactory.java`
   - **notification**: `Notification.java`, `EmailNotification.java`, `SMSNotification.java`, `PushNotification.java`
   - **strategy**: `SendStrategy.java`, `ImmediateSendStrategy.java`, `DelayedSendStrategy.java`
   - **singleton**: `NotificationManager.java`
   - **observer**: `NotificationObserver.java`, `LoggerObserver.java`, `AnalyticsObserver.java`
   - **src**: `NotificationSystemApp.java` (Main class)

---

### Usage

1. **Create a Message**:
   - Messages are created as objects that implement the `Message` interface. You can enhance the message with decorators like `EncryptedMessage` and `TimestampedMessage`.

2. **Select Notification Type**:
   - Use `NotificationFactory` to create instances of notifications (Email, SMS, or Push).

3. **Select Sending Strategy**:
   - Choose between immediate or delayed sending strategies by implementing the `SendStrategy` interface.

4. **Send Notification**:
   - Use `NotificationManager` to manage the sending process. It ensures that only one instance exists globally.

5. **Add Observers**:
   - Add observers like `LoggerObserver` and `AnalyticsObserver` to track notifications being sent.

---

### Example Code

Here's an example of how to use the notification system:

```java
package src;

import decorator.EncryptedMessage;
import decorator.TimestampedMessage;
import factory.NotificationFactory;
import notification.Notification;
import notification.EmailNotification;
import strategy.DelayedSendStrategy;
import strategy.SendStrategy;
import singleton.NotificationManager;
import observer.LoggerObserver;

public class NotificationSystemApp {
    public static void main(String[] args) {
        // Create a message with encryption and timestamp
        Message message = new EncryptedMessage(new TimestampedMessage(new EmailMessage("Hello, World!")));

        // Create a notification
        Notification notification = new EmailNotification(message);

        // Set the sending strategy
        SendStrategy strategy = new DelayedSendStrategy();

        // Create the notification manager
        NotificationManager manager = NotificationManager.getInstance();

        // Add observers
        manager.addObserver(new LoggerObserver());

        // Send the notification
        manager.sendNotification(notification, strategy);
    }
}
```

---

### Design Patterns Used

1. **Factory Pattern**: 
   - Used in `NotificationFactory` to instantiate the appropriate notification type (Email, SMS, Push).

2. **Strategy Pattern**: 
   - Allows the runtime selection of sending strategies (`ImmediateSendStrategy`, `DelayedSendStrategy`).

3. **Singleton Pattern**: 
   - Ensures only one `NotificationManager` instance is used globally.

4. **Observer Pattern**: 
   - Notifies observers (e.g., loggers and analytics) when a notification is sent.

5. **Decorator Pattern**: 
   - Enhances the message content dynamically by adding features like encryption and timestamps.

---

### Running the Application

1. Build the project and run the `NotificationSystemApp` class.
2. The application will send a notification, add timestamp and encryption, and log the process.

---

### Conclusion

This project demonstrates how to implement a notification system in Java using various design patterns. It highlights the importance of flexibility and maintainability in system design. By using patterns like Factory, Strategy, Singleton, Observer, and Decorator, the system can easily be extended to add more features or support additional notification types.

---

### License

MIT License
