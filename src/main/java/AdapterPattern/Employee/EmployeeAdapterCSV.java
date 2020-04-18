package AdapterPattern.Employee;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV){
        this.instance = employeeCSV;
    }

    public String getId() {
        return instance.getId()+"";
    }

    public String getFirstName() {
        return instance.getFirstName();
    }

    public String getLastName() {
        return instance.getLastName();
    }

    public String getEmail() {
        return instance.getEmail();
    }
}
