package org.ccsunnyfd.design;

import org.ccsunnyfd.design.humanResource.AbstractHumanResource;
import org.ccsunnyfd.design.humanResource.Department;
import org.ccsunnyfd.design.humanResource.Employee;
import org.ccsunnyfd.design.repository.DepartmentRepo;
import org.ccsunnyfd.design.repository.EmployeeRepo;

import java.util.List;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    private static final long ORGANIZATION_ROOT_ID = 1001L;

    private DepartmentRepo departmentRepo;
    private EmployeeRepo employeeRepo;

    public Demo(DepartmentRepo departmentRepo, EmployeeRepo employeeRepo) {
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
    }

    public AbstractHumanResource buildOrganization() {
        Department rootDepartment = new Department(ORGANIZATION_ROOT_ID);
        buildOrganization(rootDepartment);
        return rootDepartment;
    }

    private void buildOrganization(Department department) {
        List<Long> subDepartmentIds = departmentRepo.getSubDepartmentIds(department.getId());
        System.out.println("部门id: " + department.getId() + ", 子部门编号： " + subDepartmentIds);
        for (Long subDepartmentId: subDepartmentIds) {
            Department subDepartment = new Department(subDepartmentId);
            department.addSubNode(subDepartment);
            buildOrganization(subDepartment);
        }
        List<Long> employeeIds = employeeRepo.getDepartmentEmployeeIds(department.getId());
        for(Long employeeId: employeeIds) {
            double salary = employeeRepo.getEmployeeSalary(employeeId);
            department.addSubNode(new Employee(employeeId, salary));
        }
    }

    public static void main(String[] args) {
        AbstractHumanResource hr = new Demo(new DepartmentRepo(), new EmployeeRepo()).buildOrganization();
        System.out.println("总工资：" + hr.calculateSalary());
    }
}
