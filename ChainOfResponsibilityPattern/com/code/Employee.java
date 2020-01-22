package code;

/**
 * ClassName：Employee
 * Description：TODO
 * CreatedAt：2020/1/22 11:08 AM
 * Author：Xavier
 */
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void applyForLeave (int days, Employee employee) {

        Manager teamLeader = new TeamLeader();
        Manager heads = new DepartmentHeads();
        Manager boss = new Boss();

        teamLeader.setNext(heads);
        heads.setNext(boss);

        teamLeader.approveHolidays(days, employee);
    }

    public static void main (String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Xavier");
        employee1.applyForLeave(2, employee1);


        Employee employee2 = new Employee();
        employee2.setName("Siki");
        employee2.applyForLeave(4, employee2);

        Employee employee3 = new Employee();
        employee3.setName("Jack");
        employee3.applyForLeave(6, employee3);

    }
}
