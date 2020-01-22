package code;

/**
 * ClassName：DepartmentHeads
 * Description：TODO
 * CreatedAt：2020/1/22 10:56 AM
 * Author：Xavier
 */
public class DepartmentHeads extends Manager {

    @Override
    public void approveHolidays(int days, Employee employee) {
        if (days <= 5) {
            System.out.println("员工：" + employee.getName() + "请假，假期小于等于5天，组长有权审批.");
        } else {
            if (null != this.getNext()) {
                this.getNext().approveHolidays(days, employee);
            } else {
                System.out.println("没有下一位审批者，审批流程结束.");
            }
        }
    }
}
