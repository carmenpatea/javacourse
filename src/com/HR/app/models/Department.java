package com.HR.app.models;
import com.HR.app.models.Employee;

import java.util.Arrays;

public class Department {
    private String name;
    private Employee[] employees = new Employee[9];// bug: it is NullPointerException if set 10 not 3
    private int lastItem= -1;

    public Department (String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployeeAtDepartment(Employee newEmployee) {
        if (lastItem < employees.length) {
            lastItem++;
            employees[lastItem] = newEmployee;
        }
    }

    public Employee[] getAllEmployeesFromDepartment() {
        Employee[] thisEmployee = new Employee[lastItem+1];

        if (Arrays.stream(employees).allMatch(Employee::nonNull)) {
            thisEmployee = employees;
        }
        return thisEmployee;
    }

    public int getNoEmployeesOfDepartment() {
        return employees.length;
    }

    public Employee getEmployeeByID(int IDEmployee) throws NullPointerException {
        Employee employee = null;
        for ( Employee anyEmployee:employees ) {
            if ( anyEmployee != null) {
                if (anyEmployee.getID() == IDEmployee) {
                    employee = anyEmployee;
                    break;
                }
            }
        }
        return employee;
    }

    public double totalSalarysFromDepartment() throws NullPointerException {
        double totalSalary = 0.0;
        for ( Employee employee:employees ) {
            if ( employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double averageSalarysFromDepartment() {
        if(getNoEmployeesOfDepartment() > 0 ) {
            return totalSalarysFromDepartment() / getNoEmployeesOfDepartment();
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
