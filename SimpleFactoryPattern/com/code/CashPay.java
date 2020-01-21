package code;

/**
 * ClassName：CashPay
 * Description：TODO
 * CreatedAt：2020/1/16 7:20 PM
 * Author：Xavier
 */
public class CashPay extends Pay {
    @Override
    public void doPay() {
        System.out.println("CashPay On Processing......");
    }

    public static void main(String[] args) {
        CashPay cashPay = new CashPay();
        cashPay.doPay();
    }
}
