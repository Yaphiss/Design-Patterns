package code.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * ClassName：OperationEventSource
 * Description：TODO
 * CreatedAt：2020/1/29 12:01 AM
 * Author：Xavier
 */
public class OperationEventSource {

    private ArrayList<IOperationTypeEventListener> eventListeners;

    public OperationEventSource() {
        this.eventListeners = new ArrayList<>();
    }

    public void addListeners(IOperationTypeEventListener listener) {
        this.eventListeners.add(listener);
    }

    public void removeListener(IOperationTypeEventListener listener) {
        this.eventListeners.remove(listener);
    }

    public void exec (boolean isLogin) {
        LoginTypeEvent loginTypeEvent = new LoginTypeEvent(this, isLogin);
        this.doing(loginTypeEvent);
    }

    private void doing(BaseEvent event) {
        Iterator<IOperationTypeEventListener> iterator = this.eventListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().execute(event);
        }
    }
}
