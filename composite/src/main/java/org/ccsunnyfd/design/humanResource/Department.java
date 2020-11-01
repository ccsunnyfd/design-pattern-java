package org.ccsunnyfd.design.humanResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Department
 *
 * @version 1.0
 */
public class Department extends AbstractHumanResource {
    private List<AbstractHumanResource> subNodes = new ArrayList<>();
    public Department (long id) {
        super(id);
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0d;
        for(AbstractHumanResource humanResource:subNodes) {
            totalSalary += humanResource.calculateSalary();
        }
        this.salary = totalSalary;
        return totalSalary;
    }

    public void addSubNode(AbstractHumanResource humanResource) {
        subNodes.add(humanResource);
    }
}
