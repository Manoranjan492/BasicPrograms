import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Enter The String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int len=str.length();
        String nstr="";
        for(int  i=0;i<len;i++){
            char ch=str.charAt(i);
            nstr=ch+nstr;
        }
        if(str.equalsIgnoreCase(nstr))
            System.out.println(str +" is Palindrome String");
        else
            System.out.println(str +" is not Palindrome String");

    }
}
