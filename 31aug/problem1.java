 //create an employee class with attributes like emp id, emp name, salary, department. Create class teaching, non teaching, manager and outsourced and all these class will inherit emp lass. manager will have manager id. Teacher will have course assigned.Non teaching will have section assigned and outsourced will have tenure. There will be a method calculte salary in emp class which is to be modified in other classes as well. Use SUPER keyword//
 import java.util.Scanner;
 class employee{
    private String name;
    private int id;
    private int salary;
    private String department;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
 }
 class teaching extends employee{
    private String course_assigned;
    private int no_of_courses;
    public teaching(int id, String name, int salary, String department, String course_assigned, int no_of_courses){
        super(id,name,salary,department);
        this.course_assigned=course_assigned;

    }
    public String get_course(){
        return course_assigned;    }
    void setCourse(String course_assigned){
        this.course_assigned=course_assigned;
    }  
    public int get_no_of_courses(){
        return no_of_courses;
    } 
    public void set_no_of_courses(int no_of_courses){
        this.no_of_courses=no_of_courses;
    } 
 
    }
class non_teaching extends employee{
    String section_id;
    String designation;
    public non_teaching(int id,String name,int salary,String department,String section_id, String designation){
        super(id,name,salary,department);
        this.section_id=section_id;
        this.designation=designation;

    }
    public String getSection_id(){
        return section_id;
    }
    public void setSection_id(String section_id){
        this.section_id=section_id;
    }
    public String getDesignation(){
        return designation;
        
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
}
class outsourced extends employee{
    private int tenure;
    public outsourced(int id,String name,int salary,String department,int tenure){
        super(id,name,salary,department);
        this.tenure=tenure;
    }
    public int getTenure(){
        return tenure;
    }
    public void setTenure(int tenure){
        this.tenure=tenure;
    }
}
class manager extends employee{
    private int mgrid;
    public manager(int id,String name,int salary,String department,int mgrid){
        super(id,name,salary,department);
        this.mgrid=mgrid;
    }
    public int getMgrid(){
        return mgrid;
    }
    public void setMgrid(int mgrid){
        this.mgrid=mgrid;
    }
}
public class problem1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("----EMPLOYEE DETAILS----")
    }
}