import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:-");
        String str=sc.next();
        System.out.println("enter a character:- ");
        char ch=sc.next().charAt(0);
        int len=str.length();
        char[] charr=str.toCharArray();
        int count=0;
        for (int i = 0; i <len ; i++) {
            if (charr[i]==ch){
                count ++;
            }
        }
        System.out.println(count);
    }
}
