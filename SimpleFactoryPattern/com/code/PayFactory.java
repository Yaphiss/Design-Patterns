package code;


/**
 * ClassName：PayFactory
 * Description：TODO
 * CreatedAt：2020/1/16 9:19 PM
 * Author：Xavier
 */
public class PayFactory {

    public Pay getPayWay(String payType) throws Exception {
        payType = payType.trim();
        if ("".equalsIgnoreCase(payType)) throw new Exception("PayType Should Exist");

        Pay pay = null;

        switch (payType) {
            case "cash":
                pay = new CashPay();
                break;
            case "credit":
                pay = new CreditPay();
                break;
        }

//        char[] chars = payType.toCharArray();
//        chars[0] = toUpperCase(chars[0]);
//        String clazzNameStr = String.valueOf(chars);
//        Class clazz = Class.forName("code." + clazzNameStr + "Pay");
//        Pay pay = (Pay) clazz.newInstance();

        return pay;
    }

    public char toUpperCase(char word) {
        if (word >= 97 && word <= 122) {
            word ^= 32;
        }
        return word;
    }

    public static void main (String[] args) {

        try {
            PayFactory factory = new PayFactory();
            Pay pay = factory.getPayWay("credit");
            pay.doPay();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
