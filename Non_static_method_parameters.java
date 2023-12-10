public class Non_static_method_parameters {
    void addition(int a, int b){
        int c=a+b;
        System.out.println("Add: "+c);
    }
    void subtraction(int a, int b){
        int c=a-b;
        System.out.println("Sub: "+c);
    }
    void multiplication(int a, int b){
        int c=a*b;
        System.out.println("Mul: "+c);
    }
    void division(int a, int b) {
        float c = a/b;
        System.out.println("Div: "+c);
    }

    public static void main(String[] args) {
        Non_static_method_parameters obj1=new Non_static_method_parameters();
        obj1.addition(18,6);
        obj1.subtraction(18,6);
        obj1.multiplication(18,6);
        obj1.division(18,6);
        // if those methods are static then just Non_static_method_parameters.addition();
        // Non_static_method_parameters.subtraction(); etc is enough.
    }
}
