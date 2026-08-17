import java.util.Scanner;
class employee{
    String name;
    int id;
    String team;
    String course_assigned;
    String agency;
    employee(String name,int id, String team){
        this.name=name;
        this.id=id;
        this.team=team;
    }
    employee(String name, int id, String team, String course_assigned,int type){
        this.name=name;
        this.id=id;
        this.team=team;
        this.course_assigned=course_assigned;

    }
    employee( int id,String name, String team, String agency,int type){
        this.name=name;
        this.id=id;
        this.team=team;
        this.agency=agency;

    }
    void show(){
        System.out.println("-----EMPLOYEE DETAILS------");
        System.out.println("Name: "+ name);
        System.out.println ("id: "+ id);
        System.out.println("team: "+team);
        if(agency!=null){
            System.out.println("agency: "+agency);
        }  
        if(course_assigned!=null){
           System.out.println("course_assigned: "+course_assigned);
        }
    }


}

public class emp {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the employee choice");
        System.out.println("1:admin");
        System.out.println("2:teaching");
        System.out.println("3:outsourced");
        int choice=input.nextInt();
        System.out.println("Enter employee name");
        String name=input.next();
        input.nextLine();
        System.out.println("enter emp id");
        int id=input.nextInt();
        input.nextLine();
        System.out.println("enter team");
        String team=input.nextLine();

        employee employee;
        if(choice==1){
            employee=new employee(name,id,team);
        }                                                   
        else if(choice==2){
            System.out.println("Enter course assigned:");
            String course_assigned=input.nextLine();
            employee=new employee(name,id,course_assigned,team,2);
            }
        else if(choice==3){
            System.out.println("Enter the agency");
            String agency=input.nextLine();
            employee=new employee(id,name,agency,team,3);
        }
        else{
             System.out.println("invalid coice");
             return;
        }
        employee.show();
        }
        

    
    
}
