class Tata {
    void model(){
        System.out.println("Safari");
    }
}
class Car extends Hyundai {
        void engine(){
        System.out.println("4 cylinder");
        }
        }
public class Inheritance_single {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.model();
        c.engine();
    }
}
