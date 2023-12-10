public class Non_static_method_simple {
     void add(){
        int a=25;
        int b=15;
        int c=a+b;
        System.out.println("Add: "+c);
    }
    void sub(){
        int a=25;
        int b=15;
        int c=a-b;
        System.out.println("sub: "+c);
    }
    void mul(){
        int a=25;
        int b=15;
        int c=a*b;
        System.out.println("mul: "+c);
    }
    void div(){
        int a=25;
        int b=15;
        float c=a/b;
        System.out.println("div: "+c);
    }
    public static void main(String[] args) {
     Non_static_method_simple obj1=new Non_static_method_simple();
     obj1.add();
     obj1.sub();
     obj1.mul();
     obj1.div();
    }
}
