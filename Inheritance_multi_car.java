class Vehicle{
    void type(){
        System.out.println("4 wheeler");
    }
}
class Hyundai extends Vehicle {
    void model(){
        System.out.println("Tucsan");
    }
}
class Car1 extends Hyundai {
    void engine(){
        System.out.println("8 cylinder");
    }
}
public class Inheritance_multi_car {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.type();
        c.model();
        c.engine();
    }
}
