package code.example2;

import java.util.HashMap;

/**
 * ClassName：Client
 * Description：TODO
 * CreatedAt：2020/1/29 12:50 AM
 * Author：Xavier
 */
public class Client {

    public static void main(String[] args) {

        // User Log In Logic
        // ......
        // Log In Logic Finished
        OperationEventSource source = new OperationEventSource();
        LoginEventListener loginEventListener = new LoginEventListener();
        UserHealthCheckListener userHealthCheckListener = new UserHealthCheckListener();

        source.addListeners(loginEventListener);
        source.addListeners(userHealthCheckListener);

        source.exec(true);
    }

}
