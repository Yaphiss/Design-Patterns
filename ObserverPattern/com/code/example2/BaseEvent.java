package code.example2;

import java.util.EventObject;
import java.util.HashMap;

/**
 * ClassName：BaseEvent
 * Description：TODO
 * CreatedAt：2020/1/29 12:14 AM
 * Author：Xavier
 */
public class BaseEvent extends EventObject {

    private String type;

    private HashMap params;

    public HashMap getParams() {
        return params;
    }

    public void setParams(HashMap params) {
        this.params = params;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public BaseEvent(Object source) {
        super(source);
    }
}
