package case_study.repository.employee_repository;

import case_study.model.employee.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployeeList();
    void addNewEmployee(Employee employee);
    void editEmployee(int id, Employee employee);
    int checkById(int id);
}
