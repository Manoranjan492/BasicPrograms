//Strong Number:- It's a Number in which , sum of the factorial of individual Digits will be equal to The Number
import java.util.*;

/**
 * In this We will just find out the last digit individually and findFactorial() with find the factorial for Individual Digits
 */

public class Strong {
    //Function to find the factorial
   static int findFactorial(int num){
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter A Number to Check:-");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;
        while(number>0)
        {
            int rem = number % 10;
            sum += findFactorial(rem);
            number = number / 10;
        }

        if(sum==original)
            System.out.println("Strong Number");
        else
            System.out.println("Not A Strong Number");
    }
}

//Ex :- 1,2,145 ,40585 etc are Strong Number.
