public class armstrongnumber{
    public static void main(String args[]){
        range:
        for(int i=100;i<999;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int remainder=temp%10;
                sum+=remainder*remainder*remainder;
                temp/=10;
            }
            if(sum==i){
            System.out.println("First armstrong number is "+ i);
            break range;

            }

        }
    }
    
}
