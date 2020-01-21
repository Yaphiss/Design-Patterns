package code;

/**
 * ClassName：HaierTVFactory
 * Description：TODO
 * CreatedAt：2020/1/16 10:48 PM
 * Author：Xavier
 */
public class HaierTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        System.out.println(">>>> 启动海尔电视工厂生产电视");
        return new HaierTV();
    }
}
