public class All_methods {
    static void add(){
        int a=25;
        int b=15;
        int c=a+b;
        System.out.println(c);
    }
    static void sub(){
        int a=25;
        int b=15;
        int c=a-b;
        System.out.println(c);
    }
    static void mul(){
        int a=25;
        int b=15;
        int c=a*b;
        System.out.println(c);
    }
    static void div(){
        int a=25;
        int b=15;
        float c=a/b;
        System.out.println(c);
    }
    static void addition(int a, int b){
        int c=a+b;
        System.out.println(c);
    }
    static void subtraction(int a, int b){
        int c=a-b;
        System.out.println(c);
    }
    static void multiplication(int a, int b){
        int c=a*b;
        System.out.println(c);
    }
    static void division(int a, int b){
        float c=a/b;
        System.out.println(c);
    }
    static int addi(){
        int a=40;
        int b=20;
        int c=a+b;
        return c;
    }
    static int subs(){
        int a=40;
        int b=20;
        int c=a-b;
        return c;
    }
    static int multi(){
        int a=40;
        int b=20;
        int c=a*b;
        return c;
    }
    static float divs(){
        float a=40;
        float b=20;
        float c=a/b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Simple method");
        add();
        sub();
        mul();
        div();
        System.out.println("Method with parameters");
        addition(30, 15);
        subtraction(30,15);
        multiplication(30,15);
        division(30,15);
        System.out.println("Returnable method");
        System.out.println(addi());
        System.out.println(subs());
        System.out.println(multi());
        System.out.println(divs());
    }
}
