import java.util.Scanner;

public class Pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Maths marks out of 100");
        int m=sc.nextInt();
        System.out.println("Enter your Physics marks out of 100");
        int p=sc.nextInt();
        System.out.println("Enter your Chemistry marks out of 100");
        int c=sc.nextInt();
        float avg=((m+p+c)/3);
        if (avg>=40 && m>=35 && p>=35 && c>=35){
            System.out.println("Congrats, you have Passed");
        }
        else {
            System.out.println("Sorry, you have Failed");
        }
    }
}
