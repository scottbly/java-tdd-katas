package kata.employeereport;

import kata.employeereport.Employee.EmployeeDatabase;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

class EmployeeReport {

    static List<Employee> employeeReportFor(DayOfWeek dayOfWeek) {
        Employee[] employees = EmployeeDatabase.getEmployees();
        return new ArrayList<>();
    }

}