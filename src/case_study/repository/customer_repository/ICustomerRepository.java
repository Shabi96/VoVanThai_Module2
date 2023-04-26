package case_study.repository.customer_repository;

import case_study.model.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getCustomerList();
    void addNewCustomer(Customer customer);
    void editCustomer(int id, Customer customer);
    int checkById(int id);
}
