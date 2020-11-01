package org.ccsunnyfd.design.repository;

import java.util.*;

/**
 * DepartmentRepo
 *
 * @version 1.0
 */
public class DepartmentRepo {
    private Long[] subDepartment1 = {2001L, 2002L};
    private Long[] subDepartment2 = {20011L};
    public Map<Long, List<Long>> departmentMap = new HashMap<Long, List<Long>>() {{
        put(1001L, Arrays.asList(subDepartment1));
        put(2001L, Arrays.asList(subDepartment2));
    }};

    public List<Long> getSubDepartmentIds(long id) {
        if (departmentMap.containsKey((Long)id)) {
            return departmentMap.get((Long)id);
        }
        return Collections.emptyList();
    }
}
