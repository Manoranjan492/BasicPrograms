import java.util.*;
//Strong Number:- It's a Number in which , sum of the factorial of individual Digits will be equal to The Number
/**
 * In this We will just find out the last digit individually and findFactorial() with find the factorial for Individual Digits
 */
public class StrongRange {
        static int findFactorial(int num){
            int fact=1;
            while(num>0){
                fact=fact*num;
                num--;
            }
            return fact;
        }
        public static void main(String[] args) {
            int sum = 0;

            for(int i=1;i<=1000;i++){
            while(i>0)
            {
                int original=i;
                int rem = i % 10;
                sum += findFactorial(rem);
                i = i / 10;

                if(sum==i)
                    System.out.println(i+" ");
            }


        }
    }

//Ex :- 1,2,145 ,40585 etc are Strong Number.

}
