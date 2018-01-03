/**
 * Created by winniejeng on 3/17/17.
 */
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
//        int var;
//        String str = " ";
        ArrayList<String> first = new ArrayList<>();

        first.add("Alice");
        first.add("Bill");
        first.add("Will");
        first.add("Cassie");

        System.out.println(first.size());
        System.out.println(first.get(0));
        System.out.println(first.get(1));
        System.out.println(first.get(2));
        System.out.println(first.get(3));
        System.out.println();

        //change element in position zero

        first.set(0, "Winnie");
        System.out.println(first.size());
        for (int i = 0; i < first.size(); i++) {
            System.out.println(first.get(i));
        }
        System.out.println();

        //Remove somebody

        first.remove(2);
        System.out.println(first.size());
        for (int i = 0; i < first.size(); i++) {
            System.out.println(first.get(i));
        }
        System.out.println();

        //Add somebody, and use an enhanced for loop to print

        first.add(2, "Paul");
        System.out.println(first.size());
        for (String element : first) {
            System.out.println(element);
        }
        System.out.println();

        //Boxing
        ArrayList<Integer> studentScores = new ArrayList<>();
        int score = 100;
        studentScores.add(100); //autoboxing
        studentScores.add(90);
        studentScores.add(80);
        studentScores.add(70);
        for (int i = 0; i < studentScores.size(); i++) {
            int scoreOut = studentScores.get(i);
            System.out.println(scoreOut); //auto unboxing
            //int scoreOut= studentScores.get(0).intValue();  <--behind the back
        }


    }
}
