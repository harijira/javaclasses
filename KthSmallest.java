import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={6,3,9,5,1,8,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice below (between 1-7)");
        int choice=sc.nextInt();
        Arrays.sort(arr);
        System.out.printf("%sth smallest number is: ", choice);
        System.out.println(arr[(choice-1)]);
    }
}
