/**
 * Created by winniejeng on 3/9/17.
 */

public class Practice {
    public static void main(String[] args) {
        //write a program that swaps the first and second half of the array
        int[] arr = {2, 2, 2, 4, 5, 5, 5};
        int i = 0;

        if (arr.length % 2 == 0) {
            int j = arr.length / 2;
            while (i < arr.length / 2) {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

        else {
            int j = arr.length / 2 + 1;
            while (i < arr.length / 2) {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

        for (int element : arr) {
            System.out.println(element);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
