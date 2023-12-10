import java.util.Scanner;

class Price_Compare{
    void compare(int[] a, int sd1, int ed1){
        if(ed1 < a.length && sd1 <= ed1) {
            if(a[sd1]<a[ed1]) {
                System.out.println("1 or Profit");
            }
            else if (a[sd1]==a[ed1]) {
                System.out.println("No profit or loss");
            }
            else {
                System.out.println("0 or Loss");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
public class Stock_Price_Compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] s={85,93,68,80,97,125,93};
        System.out.println("Enter start date and end date below b/w 0-6 days");
        int sd=sc.nextInt();
        int ed=sc.nextInt();
        Price_Compare c=new Price_Compare();
        c.compare(s, sd, ed);
    }
}
