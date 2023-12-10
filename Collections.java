import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections {
    public static void main(String[] args) {
        //Java API--> Stream API
//Array list ---> String  [Sushant, Sunil, Prajwal, Amisha, Shristva]
        int count=0;
        ArrayList<String> name=new ArrayList<>();
        name.add("Sushant"); name.add("Suni"); name.add("Praj"); name.add("Amisha");
        name.add("Shristva");

        for (String str:
                name) {
            if (str.startsWith("S")){
                ++count;
            }
        }
        // System.out.println(count);

        //lembda expression
        long cou=name.stream().filter(s -> {
                    return s.startsWith("S");  // terminal
                })
                .count();
        // System.out.println(cou);


        // System.out.println(Stream.of("Abhay","srinavas","Sanjay").filter(s->s.startsWith("A")).count());

        // for printing the name whose lenth is greater than 5;
        //name.stream().filter(s->s.length()>5).forEach(s -> System.out.println(s));

        //string manupulation
        // map---> term method
        //name.stream().map(s -> s.toUpperCase()).forEach(s-> System.out.println(s));

        //sorted
        // lexigrogical series
        List<String> mod=  name.stream().sorted().collect(Collectors.toList());
        System.out.println(mod.get(0));

        //moolyaed
        boolean bn= name.stream().anyMatch(s -> s.equalsIgnoreCase("moolyaed"));
        // System.out.println(bn);

        //convert it arraylist
    }
}
