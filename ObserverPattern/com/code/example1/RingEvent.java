package code.example1;

import java.util.EventObject;

/**
 * ClassName：RingEvent
 * Description：TODO
 * CreatedAt：2020/1/24 12:03 PM
 * Author：Xavier
 */
public class RingEvent extends EventObject {
    private static final long serialVersionUID = 13624116184254946L;
    private boolean sound;

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.setSound(sound);
    }
}
