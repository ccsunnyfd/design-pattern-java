package org.ccsunnyfd.design.repository;

import java.util.*;

/**
 * EmployeeRepo
 *
 * @version 1.0
 */
public class EmployeeRepo {
    private Long[] employeeGroup1 = {3001L};
    private Long[] employeeGroup2 = {3021L, 3022L};
    private Long[] employeeGroup3 = {3031L};
    private Long[] employeeGroup4 = {30211L, 30212L};

    public Map<Long, List<Long>> employeeMap = new HashMap<Long, List<Long>>() {{
        put(1001L, Arrays.asList(employeeGroup1));
        put(2001L, Arrays.asList(employeeGroup2));
        put(20011L, Arrays.asList(employeeGroup4));
        put(2002L, Arrays.asList(employeeGroup3));
    }};

    public Map<Long, Double> salaryMap = new HashMap<Long, Double>() {{
        put(3001L, 1000D);
        put(3021L, 1000D);
        put(3022L, 3000D);
        put(3031L, 1000D);
        put(30211L, 2000D);
        put(30212L, 2000D);
    }};

    public List<Long> getDepartmentEmployeeIds(long id) {
        if (employeeMap.containsKey((Long)id)) {
            return employeeMap.get((Long)id);
        }
        return Collections.emptyList();
    }

    public double getEmployeeSalary(long id) {
        if (salaryMap.containsKey((Long)id)) {
            return salaryMap.get((Long)id);
        }
        return 0d;
    }
}
