package AdapterPattern.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<Employee>();
        Employee employeeFromDb = new EmployeeDB("1234","manoj","last","abc@gmail.com");
        employees.add(employeeFromDb);

        // will not work this is why adaptor comes into play
        //Employee employeeFromLdap = new EmployeeLdap("456","madushanka","last","pqr@gmil.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("456","madushanka","last","pqr@gmil.com");
        // below line is error so we create EmployeeAdaptorLdap
        //employees.add(employeeFromLdap);
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeCSV = new EmployeeCSV("2435,manoj,madushanka,hsgdg@gmaul.com");
        // for print object data add tostring to adapter
        employees.add(new EmployeeAdapterCSV(employeeCSV));


        return employees;
    }
}
