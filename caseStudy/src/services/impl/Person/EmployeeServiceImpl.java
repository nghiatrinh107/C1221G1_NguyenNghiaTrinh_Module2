package services.impl.Person;

import models.person.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employeeList = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);

    public EmployeeServiceImpl(List<Employee> employees) {
        this.employeeList = employees;
    }

    public EmployeeServiceImpl() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    @Override
    public void edit(int index) {
        int chooseMenu = -1;
        do {
            System.out.println("Edit:\n" +
                    "1. ID\n" +
                    "2. Full name\n" +
                    "3. Birthday \n" +
                    "4. Gender\n" +
                    "5. Identity Card\n" +
                    "6. Email\n" +
                    "7. Phone\n" +
                    "8. Degree\n" +
                    "9. Position\n" +
                    "10. Salary\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.print("edit Id:");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    employeeList.get(index).setId(idEdit);
                    break;
                case 2:
                    System.out.print("edit Full Name: ");
                    String nameEdit = scanner.nextLine();
                    employeeList.get(index).setFullName(nameEdit);
                    break;
                case 3:
                    System.out.println("edit Birthday: ");
                    String birthdayEdit = scanner.nextLine();
                    employeeList.get(index).setBirthday(birthdayEdit);
                    break;
                case 4:
                    System.out.println("edit gender: ");
                    String genderEdit = scanner.nextLine();
                    employeeList.get(index).setGender(genderEdit);
                    break;
                case 5:
                    System.out.println("edit Identity Card: ");
                    int editIdentityCard = Integer.parseInt(scanner.nextLine());
                    employeeList.get(index).setIdentityCard(editIdentityCard);
                    break;
                case 6:
                    System.out.println("edit Email: ");
                    String editEmail = scanner.nextLine();
                    employeeList.get(index).setEmail(editEmail);
                    break;
                case 8:
                    System.out.println("edit Degree: ");
                    String editDegree = scanner.nextLine();
                    employeeList.get(index).setDegree(editDegree);
                    break;
                case 7:
                    System.out.println("edit phone: ");
                    String editPhone = scanner.nextLine();
                    employeeList.get(index).setPhone(editPhone);
                    break;
                case 9:
                    System.out.println("edit position: ");
                    String editPosition = scanner.nextLine();
                    employeeList.get(index).setPosition(editPosition);
                    break;
                case 10:
                    System.out.println("edit salary: ");
                    String editSalary = scanner.nextLine();
                    employeeList.get(index).setSalary(editSalary);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("choose 0,1,2,3,4,5,6,7,8,9,10");
            }
        } while (chooseMenu != 0);
    }

    @Override
    public void display() {
        for (int i = 0; i < employeeList.size() ; i++) {
            System.out.println(employeeList.get(i));
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }


}
