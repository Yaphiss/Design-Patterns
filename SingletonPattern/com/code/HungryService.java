package code;

/**
 * ClassName：HungryService
 * Description：TODO
 * CreatedAt：2020/1/22 1:19 AM
 * Author：Xavier
 */
public class HungryService {
    private static HungryService instance = new HungryService();

    public HungryService() {
        System.out.println("饿汉式单例模式在类创建时就会同时实例化一个静态对象，从此供系统使用，不再变化，它是线程安全的，无需使用volatile以及synchronized进行限制。");
    }

    public static HungryService getInstance () {
        return instance;
    }

    public void doing () {
        System.out.println("开始执行方法.......");
    }

    public static void main(String[] args) {
        HungryService hungry1 = HungryService.getInstance();
        hungry1.doing();

        HungryService hungry2 = HungryService.getInstance();
        hungry2.doing();

        HungryService hungry3 = HungryService.getInstance();
        hungry3.doing();
    }
}
