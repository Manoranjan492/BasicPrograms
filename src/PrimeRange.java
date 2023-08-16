import java.util.*;


public class PrimeRange {
    static int findPrime(int num){
        int c=0;
        for(int i=2;i<=num;i++){
            if(num%i==0){
                c++;
            }
        }
        if(c==1)
            return num;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:-");
        System.out.println("Enter Second Number:-");
        int start=sc.nextInt();
        int stop=sc.nextInt();
        for(int i=start;i<=stop;i++){
            int prime=findPrime(i);
            if(prime==i)
                System.out.print(i+" ");
        }
    }

}
