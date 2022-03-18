package services.impl.person;

import controllers.EmployeeController;
import models.person.Customer;
import services.CustomerService;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public CustomerServiceImpl() {
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        CustomerServiceImpl.customerList = customerList;
    }

    @Override
    public void display() {
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
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
                    "8. Membership\n" +
                    "9. Address\n" +
                    "0. exit\n");
            System.out.print("choose: ");
            chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu) {
                case 1:
                    System.out.print("edit Id:");
                    int idEdit = Integer.parseInt(scanner.nextLine());
                    customerList.get(index).setId(idEdit);
                    break;
                case 2:
                    System.out.print("edit Full Name: ");
                    String nameEdit = scanner.nextLine();
                    customerList.get(index).setFullName(nameEdit);
                    break;
                case 3:
                    System.out.println("edit Birthday: ");
                    String birthdayEdit = scanner.nextLine();
                    customerList.get(index).setBirthday(birthdayEdit);
                    break;
                case 4:
                    System.out.println("edit gender: ");
                    String genderEdit = scanner.nextLine();
                    customerList.get(index).setGender(genderEdit);
                    break;
                case 5:
                    System.out.println("edit Identity Card: ");
                    int editIdentityCard = Integer.parseInt(scanner.nextLine());
                    customerList.get(index).setIdentityCard(editIdentityCard);
                    break;
                case 6:
                    System.out.println("edit Email: ");
                    String editEmail = scanner.nextLine();
                    customerList.get(index).setEmail(editEmail);
                    break;
                case 8:
                    System.out.println("edit membership: ");
                    String editMembership = scanner.nextLine();
                    customerList.get(index).setMembership(editMembership);
                    break;
                case 7:
                    System.out.println("edit phone: ");
                    String editPhone = scanner.nextLine();
                    customerList.get(index).setPhone(editPhone);
                    break;
                case 9:
                    System.out.println("edit address: ");
                    String editAddress = scanner.nextLine();
                    customerList.get(index).setAddress(editAddress);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("choose 0,1,2,3,4,5,6,7,8,9");
            }
        } while (chooseMenu != 0);
    }
}
