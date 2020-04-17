package AdapterPattern.Employee;

import java.util.List;

public class AdapterDemo {
   public void testAdaptor(){
       EmployeeClient client = new EmployeeClient();
       List<Employee> employees= client.getEmployeeList();
       System.out.println(employees);
   }

}
