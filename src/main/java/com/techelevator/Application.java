package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    List<Department> departments = new ArrayList<>();
    List<Employee> employees = new ArrayList<>();
    Map<String, Project> projects = new HashMap<>();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }


    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ---------------------");
        for (Department department : departments) {
            System.out.println(department.name);
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee deanJohnson = new Employee();
        deanJohnson.employeeId = 1;
        deanJohnson.firstName = "Dean";
        deanJohnson.lastName = "Johnson";
        deanJohnson.email = "djohnson@teams.com";
        deanJohnson.salary = Employee.DEFAULT_STARTING_SALARY;
        deanJohnson.department = departments.get(2);
        deanJohnson.hireDate = "08/21/2020";

        Employee angieSmith = new Employee(2, "Angie", "Smith", "asmith@teams.com",
                                           departments.get(2), "08/21/2020");
        angieSmith.salary = angieSmith.raiseSalary(10);

        Employee margaretThompson = new Employee(3, "Margaret" , "Thompson", "mthompson@teams" +
                ".com", departments.get(0), "08/21/2020");
        margaretThompson.salary = Employee.DEFAULT_STARTING_SALARY;

        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ---------------------");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + employee.getSalary() + ") " + employee.getDepartment().name);
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {
        Project teams = new Project("TEams", "Project Management Software", "10/10/2020", "11/10" +
                "/2020");

        teams.setTeamMembers(employees.subList(0, 2));

        projects.put("TEams", teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project marketing = new Project("Marketing Landing Page", "Lead Capture Landing Page for " +
                "Marketing", "10/10/2020", "10/17/2020");

        marketing.setTeamMembers(employees.subList(1,2));

        projects.put("Marketing Landing Page", marketing);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {

        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println(projects.get("TEams").name + ": " + projects.get("TEams").getTeamMembers().size());
        System.out.println(projects.get("Marketing Landing Page").name + ": " + projects.get(
                "Marketing Landing Page").getTeamMembers().size());
    }

}
