package case_study.repository.employee_repository;

import case_study.utils.employee_write_and_read.EmployeeWriteAndRead;
import case_study.model.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {

    public static final String PATH_EMPLOYEE = "src/case_study/data/employee/employee.csv";
    private static List<Employee> employeeList = EmployeeWriteAndRead.readFromFile(PATH_EMPLOYEE);

    @Override
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        EmployeeWriteAndRead.writeToFile(employeeList, PATH_EMPLOYEE);
    }

    @Override
    public void editEmployee() {
        EmployeeWriteAndRead.writeToFile(employeeList, PATH_EMPLOYEE);
    }

    @Override
    public int checkById(String code) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getCode().equals(code)) {
                return i;
            }
        }
        return -1;
    }
}
