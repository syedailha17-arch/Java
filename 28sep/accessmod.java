class Employee {
    public String name;
    protected double salary;
    String dept;           
    private int empId;

    Employee(String name, double salary, String dept, int empId) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.empId = empId;
    }

    public int getEmpId() { return empId; }
}

class Manager extends Employee {
    String designation;

    Manager(String name, int empId, double salary, String dept, String designation) {
        super(name, salary, dept, empId);
        this.designation = designation;
    }
}

public class accessmod {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ilha", 200000, "IT", 133);
        Manager m1 = new Manager("Natiq sih", 7, 200, "sih", "event skipper");

        System.out.println(e1.name);
        System.out.println(e1.salary);
        System.out.println(e1.dept);
        System.out.println(e1.getEmpId());   // not e1.empId (private)

        System.out.println(m1.name);
        System.out.println(m1.salary);
        System.out.println(m1.getEmpId());
        System.out.println(m1.designation);
    }
}

