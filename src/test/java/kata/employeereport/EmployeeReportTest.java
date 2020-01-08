package kata.employeereport;

import org.junit.Test;

import static java.time.DayOfWeek.MONDAY;
import static kata.employeereport.Employee.*;
import static kata.employeereport.EmployeeReport.employeeReportFor;
import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeReportTest {

    @Test
    public void employeeReport() {
        assertThat(employeeReportFor(MONDAY))
                .containsOnly(Max, Sepp, Tom, Nina, Mike);
    }

}