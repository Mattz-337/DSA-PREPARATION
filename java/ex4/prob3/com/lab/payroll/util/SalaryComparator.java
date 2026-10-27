package com.lab.payroll.util;

import java.util.Comparator;
import com.lab.payroll.model.Employee;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.netSalary(), e1.netSalary());
    }
}