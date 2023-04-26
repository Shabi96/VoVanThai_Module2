package case_study.repository.customer_repository;

import case_study.model.customer.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    @Override
    public List<Customer> getCustomerList() {
        return null;
    }

    @Override
    public void addNewCustomer(Customer customer) {

    }

    @Override
    public void editCustomer(int id, Customer customer) {

    }

    @Override
    public int checkById(int id) {
        return 0;
    }
}
