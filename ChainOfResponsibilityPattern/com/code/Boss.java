package code;

/**
 * ClassName：Boss
 * Description：TODO
 * CreatedAt：2020/1/22 10:56 AM
 * Author：Xavier
 */
public class Boss extends Manager {
    @Override
    public void approveHolidays(int days, Employee employee) {
        if (days > 5) {
            System.out.println("员工：" + employee.getName() + "请假，假期大于5天，老板有权审批.");
        } else {
            System.out.println("没有下一位审批者，审批流程结束.");
        }
    }
}
