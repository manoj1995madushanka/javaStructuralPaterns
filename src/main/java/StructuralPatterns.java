import AdapterPattern.Employee.AdapterDemo;

public class StructuralPatterns {

    private static void employeeAdaptor(){
        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.testAdaptor();
    }

    public static void main(String[] args){
        employeeAdaptor();
    }
}
