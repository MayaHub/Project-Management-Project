package com.techelevator;

public class Employee {

    long employeeId;
    String firstName;
    String lastName;
    String email;
    double salary;
    Department department;
    String hireDate;
    public static final double DEFAULT_STARTING_SALARY = 60000;

    public Employee() {
    }

    public Employee(long employeeId, String firstName, String lastName, String email,
                    Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getFullName() {
        return getLastName() + ", " + getFirstName();
    }

    public double raiseSalary(double percent) {
        double increase = DEFAULT_STARTING_SALARY * (percent / 100);
        return DEFAULT_STARTING_SALARY + increase;
    }
}
