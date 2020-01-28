package code.example1;

/**
 * ClassName：TeacherEventListener
 * Description：TODO
 * CreatedAt：2020/1/24 12:07 PM
 * Author：Xavier
 */
public class TeacherEventListener implements BellEventListener {
    @Override
    public void hearBell(RingEvent source) {
        if (source.isSound()) {
            System.out.println("上课铃响了，老师走进教室.");
        } else {
            System.out.println("下课铃响了，老师走出教室.");
        }
    }
}
