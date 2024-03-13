class Employee {
    int empNo;
    String empName;
    double empSalary;
    String empCity;
    Employee(int empNo, String empName, double empSalary, String empCity) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empCity = empCity;
    }
    Employee() {
    }
    void work() {
        System.out.println("Employee is working");
    }
    double getSalary() {
        return empSalary;
    }
    void addEmployee(int empNo, String empName, double empSalary, String empCity) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empCity = empCity;
    }
}
class HRManager extends Employee {
    HRManager(double empSalary) {
        super(); 
        this.empSalary = empSalary; 
    }
    void work() {
        System.out.println("HR Manager is managing human resources");
    }
    void showEmployee() {
        System.out.println("Employee Details: " + empNo + ", " + empName + ", " + empSalary + ", " + empCity);
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        emp.addEmployee(11,"Faizan" ,100000, "Thane");    
        HRManager hrManager = new HRManager(50000);
        hrManager.work();
        hrManager.showEmployee(); 
    }
}
