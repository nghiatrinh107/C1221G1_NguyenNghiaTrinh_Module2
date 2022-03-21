package controllers;

import models.person.Employee;
import services.impl.person.EmployeeServiceImpl;
import utils.ReadAndWrite;
import utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController extends PersonController {
    static EmployeeServiceImpl employee = new EmployeeServiceImpl();
    Scanner scanner = new Scanner(System.in);
    int choice = -1;
    private static final String SALARY_REGEX = "\\d{7,}(\\.\\d+)*$";
    public Employee addNewEmployee() {
        super.addNewPerson();
        do {
            for (int i = 0; i < degrees.size(); i++) {
                System.out.println(i + " " + degrees.get(i));
            }
            System.out.println("Degree: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice > degrees.size());
        String degree = degrees.get(choice);
        do {
            for (int i = 0; i < positions.size(); i++) {
                System.out.println(i + " " + positions.get(i));
            }
            System.out.println("Position: ");
            choice = Integer.parseInt(scanner.nextLine());
        } while (choice>positions.size());
        String position = positions.get(choice);
        String salary = inputSalary();
        Employee employee = new Employee(super.id, super.fullName, super.birthday, super.gender, super.identityCard, super.email, super.phone, degree, position, salary);
        return employee;
    }

    protected static List<String> degrees = new ArrayList<>();

    static {
        degrees.add(new String("INTERMEDIATE"));
        degrees.add(new String("ASSOCIATE"));
        degrees.add(new String("UNIVERSITY"));
        degrees.add(new String("POSTGRADUATE"));
    }

    protected static List<String> positions = new ArrayList<>();

    static {
        positions.add(new String("RECEPTIONIST"));
        positions.add(new String("WAITER"));
        positions.add(new String("SPECIALIST"));
        positions.add(new String("SUPERVISOR"));
        positions.add(new String("MANAGER"));
        positions.add(new String("DIRECTOR"));
    }

    public void addEmployee() {
        employee.add(addNewEmployee());
    }

    public void display() {
        employee.display();
    }

    public void edit() {
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employee.getEmployeeList().size(); i++) {
            if (employee.getEmployeeList().get(i).getId() == id) {
                System.out.println(employee.getEmployeeList().get(i));
                employee.edit(i);
            }
        }
    }
    private String inputSalary(){
        System.out.println("Salary: ");
        return RegexData.regexString(scanner.nextLine(),SALARY_REGEX,"must be a positive number");
    }
}
