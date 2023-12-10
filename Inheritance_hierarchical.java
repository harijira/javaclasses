class Cricket {
    void team(){
        System.out.println("Indian Player");
    }
}
class Batsman extends Cricket{
    void bat_skill(){
        System.out.println("Opening batsman");
    }
}
class Bowler extends Cricket{
    void bowl_skills(){
        System.out.println("Fast bowler");
    }
}
class Shop{
    void kind(){
        System.out.println("Bakery");
    }
}
class Sweet extends Shop{
    void item_name_sw(){
        System.out.println("Cake");
    }
}
class Savoury extends Shop{
    void item_name_sv(){
        System.out.println("Puffs");
    }
}
public class Inheritance_hierarchical {
    public static void main(String[] args) {
        Batsman p1=new Batsman();
        p1.team();
        p1.bat_skill();
        Bowler p2=new Bowler();
        p2.team();
        p2.bowl_skills();
        Sweet s1=new Sweet();
        s1.kind();
        s1.item_name_sw();
        Savoury s2=new Savoury();
        s2.kind();
        s2.item_name_sv();
    }
}
