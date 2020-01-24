package kata.employeereport;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public enum Employee {
    Max(17, THURSDAY, LocalDate.of(2018, 1, 1), "$8.00"),
    Sepp(19, TUESDAY, LocalDate.of(2016, 1, 1), "$10.00"),
    Tom(20, WEDNESDAY, LocalDate.of(2019, 1, 1), "$20.00"),
    Nina(15, WEDNESDAY, LocalDate.of(2019, 1, 1), "$11.50"),
    Mike(30, SATURDAY, LocalDate.of(2010, 1, 1), "$30.00");

    Employee(int age, DayOfWeek dayOff, LocalDate hireDate, String salary) {
        this.age = age;
        this.dayOff = dayOff;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    private int age;
    private DayOfWeek dayOff;
    private LocalDate hireDate;
    private String salary;

    public int getAge() {
        return age;
    }

    public DayOfWeek getDayOff() {
        return dayOff;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getSalary() {
        return salary;
    }

    public static class EmployeeDatabase {

        static Employee[] getEmployees() {
            return Employee.values();
        }

    }

}