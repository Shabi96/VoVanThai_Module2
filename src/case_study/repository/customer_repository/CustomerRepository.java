package case_study.repository.customer_repository;

import case_study.utils.customer_write_and_read.CustomerWriteAndRead;
import case_study.model.customer.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    public static final String PATH_CUSTOMER_FILE = "src/case_study/data/customer/customer.csv";
    public static List<Customer> customers = CustomerWriteAndRead.readFromFile(PATH_CUSTOMER_FILE);;

    @Override
    public List<Customer> getCustomerList() {
        return customers;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        customers.add(customer);
        CustomerWriteAndRead.writeToFile(customers, PATH_CUSTOMER_FILE);
    }

    @Override
    public void editCustomer() {
        CustomerWriteAndRead.writeToFile(customers, PATH_CUSTOMER_FILE);
    }

    @Override
    public int checkById(String code) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }
}
