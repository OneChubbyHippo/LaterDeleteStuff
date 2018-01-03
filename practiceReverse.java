/**
 * Created by winniejeng on 3/11/17.
 */
public class practiceReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        reverse(array);

    }

    static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "  ");
        }
    }
}
