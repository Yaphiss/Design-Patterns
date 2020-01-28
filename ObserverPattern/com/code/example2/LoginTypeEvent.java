package code.example2;

import java.util.EventObject;
import java.util.HashMap;

/**
 * ClassName：LoginTypeEvent
 * Description：TODO
 * CreatedAt：2020/1/28 11:56 PM
 * Author：Xavier
 */
public class LoginTypeEvent extends BaseEvent {

    private static final long serialVersionUID = -2515091209874489550L;
    private String type;

    private boolean login;

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public LoginTypeEvent(Object source, boolean login) {
        super(source);
        this.setType(this.getClass().getName());
        this.setLogin(login);
        System.out.println("类型初始化: " + this.getType());
    }
}
