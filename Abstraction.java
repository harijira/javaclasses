abstract class Furniture{
    abstract void dimension();
}
class Study_table extends Furniture{
    void dimension(){
        System.out.println("1.5mX1.5mX0.75m");
    }
}
class Dining_table extends Furniture{
    void dimension(){
        System.out.println("3.0mX3.0mX0.75m");
    }
}
abstract class Lights {
    abstract void watts();
}
class Bulb extends Lights {
    void watts(){
        System.out.println("60 watts");
    }
}
class Led extends Lights {
    void watts(){
        System.out.println("18 watts");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Study_table t1=new Study_table();
        System.out.println("Furniture:");
        t1.dimension();
        Dining_table t2=new Dining_table();
        t2.dimension();
        Bulb l1=new Bulb();
        Led l2=new Led();
        System.out.println("Lights:");
        l1.watts();
        l2.watts();
    }
}
