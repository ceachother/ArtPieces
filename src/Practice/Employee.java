package Practice;

/**
 * Created by cecillee on 1/8/2017.
 */
public class Employee implements Comparable<Employee> {
    private Integer integer;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Employee(Integer integer) {
        this.integer = integer;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.integer == o.getInteger()) {
            return 0;
        }
        return this.integer > o.getInteger() ? 1 : -1;
//        return o.getInteger() - this.integer;
    }
}
