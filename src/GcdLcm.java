import  java.util.*;
 public class GcdLcm {

     static int findLCM(int num1 , int num2){
         int orgnum1=num1,orgnum2=num2;
         while(num1>num2){
             if(num1>num2)
                 num1=num1-num2;
             else
                 num2=num2-num1;
         }
         return (orgnum1*orgnum2)/num1;
     }
         static int findGcd(int num1 , int num2){
             while(num1>num2){
                 if(num1>num2)
                     num1=num1-num2;
                 else
                     num2=num2-num1;
             }
             return num1;
         }

     public static void main(String[] args) {
         System.out.println("Enter Two numbers:-"+"\n Enter Number 1:-");
         Scanner sc= new Scanner(System.in);
         int a = sc.nextInt();
         int b=sc.nextInt();

         int GCD=findGcd(a,b);
         int LCM=findLCM(a,b);

         System.out.println(a +" and "+ b +" GCD is=" + GCD);
         System.out.println(a +" and "+ b +" LCM is=" + LCM);

     }
}
