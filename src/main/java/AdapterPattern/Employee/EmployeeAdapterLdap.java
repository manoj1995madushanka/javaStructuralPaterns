package AdapterPattern.Employee;

public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance){
        this.instance = instance;
    }

    public String getId() {
        return instance.getCn();
    }

    public String getFirstName() {
        return instance.getSurname();
    }

    public String getLastName() {
        return instance.getGiveName();
    }

    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterLdap{" +
                "instance=" + instance +
                '}';
    }
}
