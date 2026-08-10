public class Student {

    int id;
    String student;
    static int count = 0;

    void setName(String n) {
        this.student = n;
        count++;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("hello");

        Student s2 = new Student();
        s2.setName("bye");

        System.out.println("Number of students " + count);
    }
}