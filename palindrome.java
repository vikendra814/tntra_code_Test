import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:=");
        String str= sc.next();
        String rstr ="";
        for (int i=0; i<str.length(); i++)
        {
           char ch= str.charAt(i);
            rstr= ch + rstr;
        }

            System.out.println(str.equals(rstr));
    }

}
