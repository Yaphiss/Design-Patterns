package code;

/**
 * ClassName：HisenseTVFactory
 * Description：TODO
 * CreatedAt：2020/1/16 10:49 PM
 * Author：Xavier
 */
public class HisenseTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        System.out.println(">>>> 启动海信电视工厂生产电视");
        return new HisenseTV();
    }
}
