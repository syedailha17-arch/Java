//create a class Student with multiple constructors
import java.util.Scanner;
class Student{
    int id;
    String name;
    int year;
    String section;
    Student(int id,String name,int year){
        this.id=id;
        this.name=name;
        this.year=year;
    }
    Student(int id, String name,int year, String section){
        this.id=id;
        this.name=name;
        this.year=year;
        this.section=section;

    }
    void display(){
        System.out.println("-----STUDENT DETAILS-----");
        System.out.println("name: "+ name);
        System.out.println("id: "+id);
        System.out.println("year: "+year);
        if(section!=null){
            System.out.println("section: "+section);
        }

    }
}
public class problem2{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Which year are you in?");
        int year=input.nextInt();
        System.out.println("Enter your name:");
        String name=input.next();
        System.out.println("Whats your id:");
        int id=input.nextInt();
        Student Student;
        if(year>4){
            System.out.println("there are only four years");
            return;

        }
        else if(year==1){
            System.out.println("You are a fresher");
            Student=new Student(id,name,1);
        }
        else if(year>1){
            System.out.println("Whats your section");
            String section=input.next();
            Student=new Student(id,name,year,section);
        }
        else{
            System.out.println("error");
            return;
        }
        Student.display();
        
        


        }
}
