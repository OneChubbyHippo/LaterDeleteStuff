/**
 * Created by winniejeng on 3/11/17.
 */
public class Practice2 {
    public static void main(String[] args) {
    //write a program that finds the max and min of the array, and the sum after dropping the min

        int[] arr = {10,20,30,1,9,10};
        int min= arr[0];
        int total;

        System.out.println(max(arr));
        System.out.println(min(arr));
        total = sum(arr)-min(arr);
        System.out.println(total);
    }

    static int max(int[] array)
    {
        int largest = array[0];
        for (int element : array)
        {
            if (element > largest)
            {
                largest = element;
            }
        }
        return largest;
    }

    static int min(int[] array)
    {
        int smallest = array[0];
        for (int element : array)
        {
            if (element < smallest)
            {
                smallest = element;
            }
        }
        return smallest;
    }

    static int sum(int[] array)
    {
        int total = 0;
        for (int element : array)
        {
            total += element;
        }

        return total;
    }



}


