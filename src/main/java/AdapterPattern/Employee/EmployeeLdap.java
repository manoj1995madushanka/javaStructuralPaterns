package AdapterPattern.Employee;

// we did not implements Employee
public class EmployeeLdap {
    private String cn;
    private String surname;
    private String giveName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String giveName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.giveName = giveName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGiveName() {
        return giveName;
    }

    public String getMail() {
        return mail;
    }
}
