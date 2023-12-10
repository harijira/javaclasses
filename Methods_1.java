import java.util.Scanner;

public class Methods_1 {
    public static void add(int a, int b){
        System.out.println("Addition: "+(a+b));
    }
    public static void sub(int a, int b){

        System.out.println("Subtraction: "+(a-b));
    }
    public static void mul(int a, int b){
        System.out.println("Multiplication: "+(a*b));
    }
    public static void div(int a, int b){
        if (b==0){
            System.out.println("Division: O is invalid");
        }
        else {
            System.out.println("Division: "+(a/b));
        }
    }
    public static void mod(int a, int b){
        if (b==0){
            System.out.println("Modulus: O is invalid");
        }
        else {
            System.out.println("Modulus: "+(a%b));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        sub(a,b);
        mul(a,b);
        div(a,b);
        mod(a,b);
    }
}
