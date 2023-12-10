public class Non_static_returnable {
    int addi(){
        int a=42;
        int b=7;
        int c=a+b;
        return c;
    }
    int subs(){
        int a=42;
        int b=7;
        int c=a-b;
        return c;
    }
    int multi(){
        int a=42;
        int b=7;
        int c=a*b;
        return c;
    }
    float divs() {
        float a = 42;
        float b = 7;
        float c = a / b;
        return c;
    }

    public static void main(String[] args) {
        Non_static_returnable obj1=new Non_static_returnable();
        System.out.println("Add: "+obj1.addi());
        System.out.println("Sub: "+obj1.subs());
        System.out.println("Mul: "+obj1.multi());
        System.out.println("Div: "+obj1.divs());
    }
}
