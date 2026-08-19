//wap to use static properties of one class in another class
import java.util.Scanner;
class Student{
    int roll_number;
    static String college="NIT SRINAGAR";
    String name;
    String branch;
}
public class program5{
    public static void main(String args[]){
    Scanner input =new Scanner(System.in);
    Student s1=new Student();
    System.out.println("Whats your name?");
    s1.name=input.next();
    System.out.println("Whats your branch?");
    s1.branch=input.next();
    System.out.println("Whats your roll number?");
    s1.roll_number=input.nextInt();
    System.out.println("Whats the name of your college?");
    System.out.println("-----STUDENT DETAILS-----");
    System.out.println(s1.name);
    System.out.println(s1.branch);
    System.out.println(s1.roll_number);
    System.out.println(Student.college);
    


    }
}