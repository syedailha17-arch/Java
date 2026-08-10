import java.util.Scanner;
class NumberAnalyzes{
    void analyze(int n){
        boolean prime=true;

        if (n <= 1) {
            prime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" isnt a prime");
        }
    }
    void analyze(int n, int m){
        if (n>m){
            System.out.println(n+"is the largest");
        }
        else if(m>n){
            System.out.println(m+"is the largest");
        }
        else{
            System.out.println("Numbers are equal");
        }
    }
    void analyze(int n, int m ,int i){
       if(n<m && n<i){
        System.out.println(n+" is the smallest");
       }
       else if(m<n && m<i){
        System.out.println(m+" is the smallest");
       }
       else{
        System.out.println(i+" is the smallest");
       }
}
}
public class overloading {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        NumberAnalyzes obj = new NumberAnalyzes();

        System.out.print("Enter a number to check prime: ");
        int n = input.nextInt();
        obj.analyze(n);
        
        System.out.println("Enter two numbers:");
        n=input.nextInt();
        int m=input.nextInt();
        obj.analyze(n,m);

        System.out.println("Enter three numbers");
        n=input.nextInt();
        m=input.nextInt();
        int i=input.nextInt();
        obj.analyze(n,m,i);

    }
    
}
