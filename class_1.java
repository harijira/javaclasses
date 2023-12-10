import java.util.Locale;
import java.util.Scanner;

public class class_1 {
    public static void main(String[] args) {
        //System.out.println("Hari");
        Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int d=a+b+c;
        // System.out.println(d);
       /* System.out.println("Enter the marks below");
        int e= sc.nextInt();
        int f=sc.nextInt();
        int g=sc.nextInt();
        int h=sc.nextInt();
        int i=sc.nextInt();
        float j=((e+f+g+h+i)/5);
        System.out.println(j);
        String str="thiruvananthapuram";
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.replace('u', 'z'));*/


        String word="what?";
        if (word.length()>3){
            System.out.println("String greater than 3");
        }
        else{
            System.out.println("String less than 3");
        }
    }
}
