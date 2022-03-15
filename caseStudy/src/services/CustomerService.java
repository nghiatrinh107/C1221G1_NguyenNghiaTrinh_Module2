package services;

import models.person.Customer;

public interface CustomerService extends Service<Customer> {
    @Override
    void add(Customer customer);
}
