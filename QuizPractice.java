import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by winniejeng on 3/17/17.
 */


public class QuizPractice {

    public static void main (String[] args)
    {
        //Write a program that insert an element in your array
        int[] age = {0,1,2,4};
        int pos = 3;
        int[] age2 = new int[age.length+1];

        //transfer all of array age elements to array age2
        for (int i =0; i < age.length; i++)
        {
            age2[i] = age[i];
        }

        for (int i = age2.length-1; i > pos; i--) //i=4; 4>3; 4--
        {
            age2[i] = age2[i-1];
        }

        age2[pos] = 3;

        for (int element : age2)
        {
            System.out.print(element +" ");
        }

        System.out.println();
        System.out.println();

        //write a program that deletes the 3 at position 2
        int[] arr={1,2,3,3,4,5};
        int pos2=2;

        for (int i = 2; i < arr.length-1; i++)
        {
            arr[i]=arr[i+1];
        }

        //create a new array that is shrunk
        int[] arr2 = new int[arr.length-1];

        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i]= arr[i];
        }

        for (int element : arr2){
            System.out.print(element + " ");
        }




    }
}
