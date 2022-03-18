package services.impl.person;

import libs.EmployeeLib;
import models.person.Employee;
import services.EmployeeService;
import utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
   private static List<Employee> employeeList = new ArrayList<>();
    Scanner scanner =new Scanner(System.in);
    static final String EMPLOYEE_CSV ="src\\data\\employee.csv";

    static {
        employeeList = ReadAndWrite.readEmployeeListFromCSV(EMPLOYEE_CSV);
    }

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
                    EmployeeLib.display(EmployeeLib.degrees);
                    System.out.println("Select index: ");
                    int  indexDegree = Integer.parseInt( scanner.nextLine());
                    employeeList.get(index).setDegree(EmployeeLib.degrees.get(indexDegree));
                    break;
                case 7:
                    System.out.println("edit phone: ");
                    String editPhone = scanner.nextLine();
                    employeeList.get(index).setPhone(editPhone);
                    break;
                case 9:
                    System.out.println("edit position: ");
                    EmployeeLib.display(EmployeeLib.positions);
                    int  indexPosition = Integer.parseInt( scanner.nextLine());
                    employeeList.get(index).setPosition(EmployeeLib.positions.get(indexPosition));
                    break;
                case 10:
                    System.out.println("edit salary: ");
                    String editSalary = scanner.nextLine();
                    System.out.println("Select index: ");
                    employeeList.get(index).setSalary(editSalary);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("choose 0,1,2,3,4,5,6,7,8,9,10");
            }
        } while (chooseMenu != 0);
        ReadAndWrite.writeListPersonToCSV(EMPLOYEE_CSV,employeeList);
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
        ReadAndWrite.writeListPersonToCSV(EMPLOYEE_CSV,employeeList);
    }


}
