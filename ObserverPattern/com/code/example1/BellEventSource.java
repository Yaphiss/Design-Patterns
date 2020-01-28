package code.example1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName：BellEventSource
 * Description：TODO
 * CreatedAt：2020/1/24 12:12 PM
 * Author：Xavier
 */
public class BellEventSource {

    private ArrayList<BellEventListener> eventQueue;

    public BellEventSource() {
        eventQueue = new ArrayList<>();
    }

    public void addListener(BellEventListener listener) {
        this.eventQueue.add(listener);
    }

    public void removeListener(BellEventListener listener) {
        this.eventQueue.remove(listener);
    }

    public void ring(boolean sound) {
        RingEvent event = new RingEvent(this, sound);
        this.doing(event);
    }

    protected void doing(RingEvent event) {
        Iterator<BellEventListener> iterator =  eventQueue.iterator();
        while (iterator.hasNext()) {
            iterator.next().hearBell(event);
        }
    }
}
