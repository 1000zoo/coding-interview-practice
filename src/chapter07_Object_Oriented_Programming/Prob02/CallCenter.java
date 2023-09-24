package chapter07_Object_Oriented_Programming.Prob02;

import java.util.*;

public class CallCenter {
    public List<Employee> employees;

    public CallCenter() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void addEmployee(String name, Level level) {
        employees.add(new Employee(name, level));
    }
    public boolean dispatchCall(Customer customer) {
        employees.sort(Comparator.comparing(e -> e.level));
        for (Employee employee : employees) {
            if (employee.canDeal(customer.level)) return true;
        }
        return false;
    }
}
