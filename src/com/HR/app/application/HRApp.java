package com.HR.app.application;

import com.HR.app.models.Department;
import com.HR.app.models.Employee;

public class HRApp {
    public static void main(String[] args) {
        System.out.println("HR - Application");
        Employee employee = new Employee(01,"Popescu", 4500.5600);

        System.out.println(employee.toString());
        System.out.println();

        Department depProduction = new Department("Production");
        System.out.println(" ----Production department");

        Employee employee1 = new Employee(01,"Georgescu", 3500.5600);
        Employee employee2 = new Employee(02,"Ionescu", 4500.5600);
        Employee employee3 = new Employee(03,"Spiridonescu", 5500.5600);

        depProduction.addEmployeeAtDepartment(employee1);
        depProduction.addEmployeeAtDepartment(employee2);
        depProduction.addEmployeeAtDepartment(employee3);

        System.out.println(depProduction.toString());

        Employee [] listEmployee = depProduction.getAllEmployeesFromDepartment();
        for (Employee anyEmployee:listEmployee) {
            //if(anyEmployee != null) {
                System.out.println("** " + anyEmployee.toString());
            //}
        }

        int noEmployeeDepart = depProduction.getNoEmployeesOfDepartment();
        System.out.println(" No of employees from Department Production is " +noEmployeeDepart);

        Employee someEmployee  = depProduction.getEmployeeByID(02);
        System.out.println("The employee with ID 02 is: " + someEmployee.toString());
        Employee otherEmployee  = depProduction.getEmployeeByID(11);
        if (otherEmployee == null) {
            System.out.println(" The employee with ID 11 is not in the department Production!");
        }
        double totalSalary = depProduction.totalSalarysFromDepartment();
        System.out.println(" Total of the salaries on Production Department is " + totalSalary);

        double averageSalary = depProduction.averageSalarysFromDepartment();
        System.out.println("Avarage salary on Production Department is " + averageSalary);
    }
}
