package code.example1;

/**
 * ClassName：StudentEventListener
 * Description：TODO
 * CreatedAt：2020/1/24 12:07 PM
 * Author：Xavier
 */
public class StudentEventListener implements BellEventListener {
    @Override
    public void hearBell(RingEvent source) {
        if (source.isSound()) {
            System.out.println("上课铃响了，学生进入教室.");
        } else {
            System.out.println("下课铃响了，学生下课.");
        }
    }
}
