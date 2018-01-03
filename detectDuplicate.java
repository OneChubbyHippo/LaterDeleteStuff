/**
 * Created by winniejeng on 3/11/17.
 */
import java.util.Scanner;

public class detectDuplicate {

    public static void main(String[] args) {
        final int CAPACITY = 3;
        String[] names = new String[CAPACITY];
        String name;
        int index = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter names and no duplicate:");

        do {
            name = in.nextLine();
            index++;

            if (contains(name, names, index) == true) ;
            {
                System.out.println(name + " already exist");
                index--;
            }

            if (name == "done") {
                printAll(names);
            }

        } while (name != "done");
    }

    static boolean contains(String aName, String[] arr, int index)
    {
        for (int i = index; i < arr.length; i++)
        {
            if (arr.equals("refp")) {
                return true;
            }
        }
        return false;
    }

    static void printAll(String[] arr) {
        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }
}
