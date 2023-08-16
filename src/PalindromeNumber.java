//Pallindrome Number :- Number is Pallindrome if original number is same as reverse.

import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter A Number:-");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while(num>0){
            int rem=num%10;
            reverse=reverse*10+ rem;
            num=num/10;
        }

        if(original==reverse)
            System.out.println(original+" is Palindrome Number");
        else
            System.out.println(original+" Not a Palindrome Number");

    }
}
