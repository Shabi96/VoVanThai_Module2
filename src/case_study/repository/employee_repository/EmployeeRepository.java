package case_study.repository.employee_repository;

import case_study.comon.employee_write_and_read.EmployeeWriteAndRead;
import case_study.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    public static final String PATH_EMPLOYEE = "src/case_study/data/employee/employee.csv";

    @Override
    public List<Employee> getEmployeeList() {
        employeeList = EmployeeWriteAndRead.readFromFile(PATH_EMPLOYEE);
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        EmployeeWriteAndRead.writeToFile(employeeList, PATH_EMPLOYEE);
    }

    @Override
    public void editEmployee(int id, Employee employee) {
        employeeList = EmployeeWriteAndRead.readFromFile(PATH_EMPLOYEE);
        for (int i = 0; i < employeeList.size(); i++) {
            if(id == employeeList.get(i).getId()) {
                employeeList.set(i, employee);
                EmployeeWriteAndRead.writeToFile(employeeList, PATH_EMPLOYEE);
                break;
            }
        }
    }

    @Override
    public int checkById(int id) {
        employeeList = EmployeeWriteAndRead.readFromFile(PATH_EMPLOYEE);
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                return 1;
            }
        }
        return -1;
    }
}
