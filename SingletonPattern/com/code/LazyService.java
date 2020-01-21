package code;

/**
 * ClassName：LazyService
 * Description：TODO
 * CreatedAt：2020/1/22 1:04 AM
 * Author：Xavier
 */
public class LazyService {
    private static volatile LazyService instance = null;

    public static synchronized LazyService getInstance () {
        if (null == instance) {
            instance = new LazyService();
            System.out.println("懒汉式单例模式在所有的线程当中只会实例化一次。");
        }
        return instance;
    }

    public void doing() {
        System.out.println("开始执行方法.......");
    }


    public static void main (String[] args) {

        LazyService lazy1 = LazyService.getInstance();
        lazy1.doing();

        LazyService lazy2 = LazyService.getInstance();
        lazy2.doing();

        LazyService lazy3 = LazyService.getInstance();
        lazy3.doing();
    }
}
