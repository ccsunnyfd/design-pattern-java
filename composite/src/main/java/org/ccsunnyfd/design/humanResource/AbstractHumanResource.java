package org.ccsunnyfd.design.humanResource;

/**
 * AbstractHumanResource
 *
 * @version 1.0
 */
public abstract class AbstractHumanResource {
    protected long id;
    protected double salary;

    public AbstractHumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
