package org.ccsunnyfd.design.humanResource;

/**
 * Employee
 *
 * @version 1.0
 */
public class Employee extends AbstractHumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
