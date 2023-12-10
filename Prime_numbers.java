import java.util.Scanner;

public class Prime_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number below");
        int num=sc.nextInt();
        int a=0;
        switch (num){
            case 1:
                System.out.println("1 is neither a prime number nor a composite number");
                break;
            default:
                for (int i=2; i<num; i++) {
                    //System.out.println(num);
                    if (num%i==0) {
                        a++;
                    }
                }
                //System.out.println(a);
                if (a!=0){
                    System.out.println("It is not a prime number");
                }
                else{
                    System.out.println("It is a prime number");
                }
        }
    }
}
