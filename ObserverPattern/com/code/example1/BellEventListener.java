package code.example1;

import java.util.EventListener;

/**
 * ClassName：BellEventListener
 * Description：TODO
 * CreatedAt：2020/1/24 12:02 PM
 * Author：Xavier
 */
public interface BellEventListener extends EventListener {

    public void hearBell(RingEvent source);

}
