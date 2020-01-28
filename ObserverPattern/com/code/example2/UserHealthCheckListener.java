package code.example2;

/**
 * ClassName：UserHealthCheckListener
 * Description：TODO
 * CreatedAt：2020/1/29 1:20 AM
 * Author：Xavier
 */
public class UserHealthCheckListener implements IOperationTypeEventListener {

    @Override
    public void execute(BaseEvent event) {
        System.out.println("=== UserHealthCheckListener ===  User Health Check Begin!!!! Event Type Is ==> " + event.getType());
    }
}
