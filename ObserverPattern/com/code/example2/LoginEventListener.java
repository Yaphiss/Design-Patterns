package code.example2;


/**
 * ClassName：LoginEventListener
 * Description：TODO
 * CreatedAt：2020/1/29 12:06 AM
 * Author：Xavier
 */
public class LoginEventListener implements IOperationTypeEventListener {

    @Override
    public void execute(BaseEvent event) {
        // TODO Implement Business Logic
        System.out.println("=== LoginEventListener ===  User Had Been Log In!!!! Event Type Is ==> " + event.getType());
    }
}
