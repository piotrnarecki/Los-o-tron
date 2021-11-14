import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        List<String> people1 = new ArrayList<String>(Arrays.asList("Amanda", "Dominik", "Dodo", "Kama", "Monia", "Patryk", "Marina", "Piotr"));
        List<String> people2 = new ArrayList<String>(Arrays.asList("Amanda", "Dominik", "Dodo", "Kama", "Monia", "Patryk", "Marina", "Piotr"));
        Random randomGenerator = new Random();


        for (int i = 0; i < people1.size(); i++) {


            String name1 = people1.get(i);
            String name2 = people2.get(randomGenerator.nextInt(people2.size()));


            while (name1.equals(name2)) {
                name2 = people2.get(randomGenerator.nextInt(people2.size()));
            }

            people2.remove(name2);

            System.out.print(name1 + "-");
            System.out.println(name2);


        }


    }

}
