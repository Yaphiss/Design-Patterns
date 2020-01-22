package code;

/**
 * ClassName：TeamLeader
 * Description：TODO
 * CreatedAt：2020/1/22 10:55 AM
 * Author：Xavier
 */
public class TeamLeader extends Manager {

    @Override
    public void approveHolidays(int days, Employee employee) {

        if (days <= 2) {
            System.out.println("员工：" + employee.getName() + "请假，假期小于等于2天，组长有权审批.");
        } else {
            if (null != this.getNext()) {
                this.getNext().approveHolidays(days, employee);
            } else {
                System.out.println("没有下一位审批者，审批流程结束.");
            }
        }
    }
}
