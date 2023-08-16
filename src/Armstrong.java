//ArmStrong Number:-  It's a number in which sum of cubes of its Digit is equal to the given Number;

/**Any Modification Required, Depend On You!!!
 *
 */

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter A Number");
        Scanner sc=new Scanner(System.in);

        int num=sc.nextInt();
        int rem,sum=0,original=num;
        while(num>0){
            rem=num%10;
            sum= (int) (sum+Math.pow(rem,3));
            num=num/10;
        }

        if(sum==original)
            System.out.println("Entered Number "+original+" is An ArmStrong Number");
        else
            System.out.println("Entered Number "+original+" is not An ArmStrong Number");

    }
}
