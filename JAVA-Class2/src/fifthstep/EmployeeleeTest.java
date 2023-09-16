package fifthstep;

public class EmployeeleeTest {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");
//        System.out.println(Employee.serialNum); //호출 시 클래스 변수로 호출해야 한다. 그래서 스테틱 변수를 클래스 변수라고도 불린다.

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
//        System.out.println(Employee.serialNum);
//        System.out.println(Employee.serialNum);
        System.out.println(employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeId());
        System.out.println(Employee.getSerialNum());

//        Employee employeeLee = new Employee();
//        employeeLee.setEmployeeName("이순신");
//        System.out.println(employeeLee.serailNum);
//        Employee employeeKim = new Employee();
//        employeeKim.setEmployeeName("김유신");
    }
}
