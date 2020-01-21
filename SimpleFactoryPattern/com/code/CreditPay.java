package code;

/**
 * ClassName：CreditPay
 * Description：TODO
 * CreatedAt：2020/1/16 9:16 PM
 * Author：Xavier
 */
public class CreditPay extends Pay {
    @Override
    public void doPay() {
        System.out.println("CreditPay On Processing......");
    }

    public static void main(String[] args) {
        CreditPay creditPay = new CreditPay();
        creditPay.doPay();
    }
}
