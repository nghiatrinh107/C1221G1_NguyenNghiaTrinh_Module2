package controllers;

import models.person.Customer;
import services.impl.person.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerController extends PersonController{
    static CustomerServiceImpl customer = new CustomerServiceImpl();
    Scanner scanner =new Scanner(System.in);
    public  Customer addNewCustomer(){
        super.addNewPerson();
        for (int i = 0; i < memberships.size(); i++) {
            System.out.println(i+" "+memberships.get(i));
        }
        System.out.println("Membership");
        int indexMembership = Integer.parseInt(scanner.nextLine());
        String membership = memberships.get(indexMembership);
        System.out.println("Address");
        String address = scanner.nextLine();
        Customer customer = new Customer(super.id, super.fullName, super.birthday, super.gender, super.identityCard, super.email, super.phone,membership ,address );
        return customer;
    }
    public void addCustomer(){
        customer.add(addNewCustomer());
    }
    public void display(){
        customer.display();
    }


    protected static List<String> memberships = new ArrayList();
    static {
        memberships.add(new String("Diamond"));
        memberships.add(new String("Platinum"));
        memberships.add(new String("Gold"));
        memberships.add(new String("Silver"));
        memberships.add(new String("Member"));
    }
    public void edit(){
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <customer.getCustomerList().size() ; i++) {
           if(customer.getCustomerList().get(i).getId() == id){
               System.out.println(customer.getCustomerList().get(i));
               customer.edit(i);
           }
        }
    }
}
