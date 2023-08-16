import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter a Number:-");
        Scanner sc=new Scanner(System.in);

        int c=0;
        int num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0)
            {
                c=1;
                break;
            }
        }

        if(c==0)
            System.out.println("Entered Number "+num+" is Prime");
        else
            System.out.println("Entered Number "+num +" is not Prime");
    }
}