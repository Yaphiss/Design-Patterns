package code.example1;

/**
 * ClassName：Client
 * Description：TODO
 * CreatedAt：2020/1/24 12:24 PM
 * Author：Xavier
 */
public class Client {

    public static void main(String[] args) {

        BellEventSource source = new BellEventSource();
        source.addListener(new TeacherEventListener());
        source.addListener(new StudentEventListener());

        source.ring(true);
        source.ring(false);
    }
}
