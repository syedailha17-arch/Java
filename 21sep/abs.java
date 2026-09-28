//note:do this through interfaces too
abstract class employee{
    String name;
    int salary;
    employee(){
        this.name="some intern";
        this.salary=10000;
    }
    employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    abstract double calculateBonus();
    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());

    }
}
class intern extends employee{
    intern(){
        super();
    }
    double calculateBonus(){
        return salary*0.01;
    }
    
}
class manager extends employee{
    manager(String name,int salary){
        super(name,salary);
    }
    double calculateBonus(){
        return salary * 0.20;
    }
}
class developer extends employee{
    developer(String name,int salary){
        super(name,salary);
    }
    double calculateBonus(){
        return salary * 0.30;
    }
}

public class abs{
    public static void main(String[] args){
        employee e1=new developer("Ilha",2000000);
        employee e2=new developer("Duha",2300000);
        employee e3=new intern();
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
    
}
