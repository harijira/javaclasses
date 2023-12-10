import java.util.Arrays;
import java.util.Scanner;
class DifferenceInHeights{
    void getDifference(int[] a, int inputNum) {
        for (int i=0; i<a.length; i++){
            if(a[i]<=inputNum){
                a[i]+=inputNum;
            }
            else {
                a[i]-=inputNum;
            }
        }
        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));
        int differenceIs=a[(a.length-1)]-a[0];
        System.out.println("Difference: "+differenceIs);
    }
}
public class MinimizeHeights {
    public static void main(String[] args) {
        int[] arr={3,7,1,9,12,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for subtract or add: ");
        int commonNumber=sc.nextInt();
        DifferenceInHeights diff=new DifferenceInHeights();
        diff.getDifference(arr, commonNumber);
    }
}
