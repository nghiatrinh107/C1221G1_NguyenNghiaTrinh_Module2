package services;

import models.person.Employee;

public interface EmployeeService extends Service<Employee>{
    @Override
    void add(Employee employee);
}
