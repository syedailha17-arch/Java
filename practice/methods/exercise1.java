/*write the method that gets the name of the user and method that gets age of the use*/
import java.util.Scanner;
public class exercise1 {
        public static void main(String[] args){
            System.out.println("Name: " + user("Name")+ "AGE: " + user(0));
        }
        public static String user(String name){
            System.out.println("Enter your name");
            Scanner input=new Scanner(System.in);
            name=input.nextLine();
            return name;
        }
        public static int user(int age){
             System.out.println("Enter your name");
            Scanner input=new Scanner(System.in);
            age=input.nextInt();
            return age;
        }
    
    }
    

