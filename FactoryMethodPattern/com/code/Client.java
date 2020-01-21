package code;


/**
 * ClassName：Client
 * Description：TODO
 * CreatedAt：2020/1/16 10:49 PM
 * Author：Xavier
 */
public class Client {

    public static void main (String[] args) {

        TVFactory haier = new HaierTVFactory();
        haier.produceTV().play();

        TVFactory hisense = new HisenseTVFactory();
        hisense.produceTV().play();

    }

}
