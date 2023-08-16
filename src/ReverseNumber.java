import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number to get Reverse");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+ rem;
            num=num/10;
        }

        System.out.println("Reverse of Number is="+ reverse);
    }

}
