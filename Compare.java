import java.util.Scanner;

public class Compare
{
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers for multiplication: ");

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        //output square root

        System.out.println("Enter a number, I will find the square root of that number");
        int num3 = in.nextDouble();



        final double EPSILON = 1E-14;
        if (Math.abs(x * x - y) < EPSILON)
        {
            System.out.println("sqrt(2) times sqrt(2) is approximately 2");
        }

        // Strings

        String s = "120";
        String t = "20";

        int result = s.compareTo(t);

        String comparison;
        if (result < 0)
        {
            comparison = "comes before";
        }
        else if (result > 0)
        {
            comparison = "comes after";
        }
        else
        {
            comparison = "is the same as";
        }

        System.out.printf("The string \"%s\" %s the string \"%s\"\n", s, comparison, t);

        String u = "1" + t;

        System.out.printf("The strings \"%s\" and \"%s\" are ", s, u);
        if (s != u) { System.out.print("not "); }
        System.out.print("identical. They are ");
        if (!s.equals(u)) { System.out.print("not "); }
        System.out.println("equal.");
    }
}



