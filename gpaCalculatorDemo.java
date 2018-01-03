/**
 * Created by winniejeng on 3/23/17.
 */
public class gpaCalculatorDemo {

    public static void main (String[] args)
    {
        gpaCalculator gpa1 = new gpaCalculator("C-");
        gpaCalculator gpa2 = new gpaCalculator();

        gpa2.setGpa("A-");
        System.out.println(gpa1.getGPA());
        System.out.println(gpa2.getGPA());

    }
}
