package design;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo employeeInfoConstructor1 = new EmployeeInfo();
        EmployeeInfo employeeInfoConstructor2 = new EmployeeInfo(1);
        EmployeeInfo employeeInfoConstructor3 = new EmployeeInfo("Jeff",2);

        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.sickTime();

        employeeInfo.nestedMethod();

        EmployeeInfo.setCompanyName("CocaCola");
        System.out.println(EmployeeInfo.getCompanyName());

        EmployeeInfo.calculateEmployeeBonus(3);
        EmployeeInfo.calculateEmployeePension(2017,2018);



    }
}
