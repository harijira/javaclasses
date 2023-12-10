import java.util.Locale;
class TryOuts2{
    void sample(){
        int a=100;
        int b=200;
        int c=a+b;
        System.out.println(c);
    }
}
class Tryouts3 extends TryOuts2{
    void sample(){
       super.sample();
        int d=10;
        int e=20;
        int c=d+e;
        System.out.println(c);
    }
}

public class TryOuts {
    public static void main(String[] args) {
       /*String str="Hello, world!";
        System.out.println(str);
        System.out.println(str.charAt(5));
        System.out.println(str.substring(7,12));
        System.out.println(str.toUpperCase());
        System.out.println(str);
        int a=2;
        //System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        int[] b={5,3,4,2,5,3};
        System.out.println(b[0]);
        System.out.println(b[5]);
        for(int i = 0; i < 3; i++) {
            switch(i) {
            case 0: break;
            case 1: System.out.print("one");
            case 2: System.out.print("two");
            case 3: System.out.print("three");
        }
        }
        System.out.println("done");
        /*public void test(int x) {
            int odd = x % 2;
            if(odd)
            {
                System.out.printIn(odd);
            }
            else
            {
                System.out.printIn(even);
            }
        }*/
        TryOuts2 sam=new TryOuts2();
        //TryOuts2.sample();
        //sam.sample();
        Tryouts3 sam2=new Tryouts3();
        sam2.sample();
    }
}
