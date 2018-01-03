/**
 * Created by winniejeng on 3/11/17.
 */
public class growArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int[] newArray = new int[doubleCapacity(array)];


        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        for (int i=array.length; i < newArray.length; i++){
            newArray[i]=i+1;
        }

        for (int element : newArray) {
            System.out.print(element + " ");
        }

    }

    static int doubleCapacity(int[] arr) {
        int newCapacity = 2 * arr.length;

        return newCapacity;
    }
}
