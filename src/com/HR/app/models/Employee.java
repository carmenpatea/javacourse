package com.HR.app.models;

public class Employee {
    private int ID;
    private String name;
    private double salary;

    public Employee (int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public void setID(int  ID) { this.ID = ID;}

    public int getID() { return ID;}

    public void setName(String name) { this.name = name;}

    public String getName() { return name;}

    public void setSalary(double salary) { this.salary = salary;}

    public double getSalary() { return salary;}

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static boolean nonNull(Employee employee) {
        return employee!=null;
    }
}
