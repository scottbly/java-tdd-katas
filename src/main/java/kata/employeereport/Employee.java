package kata.employeereport;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;

public enum Employee {
    Max(LocalDate.of(2003, 1, 1), THURSDAY, LocalDate.of(2018, 1, 1), "8.00"),
    Sepp(LocalDate.of(2001, 1, 1), TUESDAY, LocalDate.of(2016, 1, 1), "10.00"),
    Tom(LocalDate.of(2000, 1, 1), WEDNESDAY, LocalDate.of(2019, 1, 1), "20.00"),
    Nina(LocalDate.of(2005, 1, 1), WEDNESDAY, LocalDate.of(2019, 1, 1), "11.50"),
    Mike(LocalDate.of(1970, 1, 1), SATURDAY, LocalDate.of(2010, 1, 1), "30.00");

    Employee(LocalDate dateOfBirth, DayOfWeek dayOff, LocalDate hireDate, String salary) {
        this.dateOfBirth = dateOfBirth;
        this.dayOff = dayOff;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    private LocalDate dateOfBirth;
    private DayOfWeek dayOff;
    private LocalDate hireDate;
    private String salary;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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

}