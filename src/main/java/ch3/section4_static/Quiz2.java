package ch3.section4_static;

class DepartmentCode {
    final int DEPARTMENT_SALES = 0;
    final int DEPARTMENT_DEVELOPER = 1;
    final int DEPARTMENT_MARKETING = 2;
}

class Employee {
    String name;
    int department;//0 - sales, 1 - developer, 2 - marketing

    Employee(String name, int department) {
        this.name = name;
        this.department = department;
    }
}

public class Quiz2 {
    public static void main(String[] args) {
        DepartmentCode code = new DepartmentCode();
        Employee emp1 = new Employee("kim", code.DEPARTMENT_SALES);
        Employee emp2 = new Employee("lee", code.DEPARTMENT_DEVELOPER);
    }
}
