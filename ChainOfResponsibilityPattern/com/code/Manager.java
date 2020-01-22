package code;

/**
 * ClassName：Manager
 * Description：TODO
 * CreatedAt：2020/1/22 10:54 AM
 * Author：Xavier
 */
public abstract class Manager {
    private Manager next;

    public Manager getNext() {
        return next;
    }

    public void setNext(Manager next) {
        this.next = next;
    }

    public abstract void approveHolidays(int days, Employee employee);
}
