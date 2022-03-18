package controllers;

import models.person.Employee;
import services.impl.person.EmployeeServiceImpl;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeController extends PersonController{
    static EmployeeServiceImpl employee = new EmployeeServiceImpl();
    Scanner scanner =new Scanner(System.in);
    public Employee addNewEmployee(){
        super.addNewPerson();
        for (int i = 0; i <degrees.size() ; i++) {
            System.out.println(i+" "+degrees.get(i));
        }
        System.out.println("Degree: ");
        int indexDegree = Integer.parseInt(scanner.nextLine());
        String degree = degrees.get(indexDegree);
        for (int i = 0; i <positions.size() ; i++) {
            System.out.println(i+" "+positions.get(i));
        }
        System.out.println("Position: ");
        int indexPosition = Integer.parseInt(scanner.nextLine());
        String position = positions.get(indexPosition);
        System.out.println("Salary");
        String salary = scanner.nextLine();
        Employee employee = new Employee(super.id, super.fullName, super.birthday, super.gender, super.identityCard, super.email, super.phone,degree,position,salary);
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
    public void addEmployee(){
        employee.add(addNewEmployee());
    }
    public void display(){
        employee.display();
    }
    public void edit(){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <employee.getEmployeeList().size() ; i++) {
            if(employee.getEmployeeList().get(i).getId() == id){
                System.out.println(employee.getEmployeeList().get(i));
                employee.edit(i);
            }
        }
    }
}
