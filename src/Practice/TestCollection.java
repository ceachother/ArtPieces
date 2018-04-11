package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by cecillee on 1/8/2017.
 */
public class TestCollection {


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(5));
        employees.add(new Employee(1));
        employees.add(new Employee(3));
        Collections.sort(employees);
        System.out.println(employees.size());

        List<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("abc");
        strings.add("efg");
        System.out.println("123" == "123");
        System.out.println(strings.contains("123"));
        System.out.println(strings.contains("abc"));
    }
}
