/**
 * Created by winniejeng on 4/1/17.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class Playcode {

    static void printAll(Printable[] things){
        //it will only take things that are Printable.
        // It's better than object. it won't print just anything
        for(Printable p : things){
            p.print();
        }
    }

    public static void main (String[] args) {

        Person alice = new Person("Alice");
        alice.print();

        System.out.println();

        Printable ford = new Vehicle(2010);
        //Or:
        //Vehicle ford = new Vehicle(2000);
        //Because a vehicle is printable.
        ford.print();

        // But because printable is an interface, not a class, you
        // cannot create an object of Printable type. It doesn't know
        // how to behave. Not allowed to instantiate an interface

        //Call the printAll method, make an array of Printable
        // This is not creating an object of printable,
        // It's only creating spots
        Printable[] arr = new Printable[2];
        arr[0] = alice;
        arr[1] = ford;
        printAll(arr);

        ArrayList<String> names = new ArrayList<String>(); //List is an interface
        List<String> colors = new LinkedList<String>();
        names.add("Alice");

        //printing two different Alices
        System.out.println(alice.toString());
        Person alice2 = new Person("Alice");
        System.out.println(alice2.toString()); //????????
        System.out.println(alice == alice2); //false
        System.out.println(alice.equals(alice2)); //false

        String s1 = new String ("Bob");
        String s2 = new String ("ZAlice");
        System.out.println(s1);
        System.out.println(s1 == s2); // they are not equal. Addresses are different
        System.out.println(s1.equals(s2)); //they are equal

        System.out.println();
        System.out.println(s2.compareTo(s1));

        String[] nom = new String[] {"ZAlice","Bob","Alice"};
//        System.out.println(Arrays.toString(nom));
        Arrays.sort(nom);
        System.out.println(Arrays.toString((nom)));

        Person bob = new Person("bob");
        Person zalice = new Person ("Zalice");
        Person rob = new Person("Rob");

        Person[] people = new Person[3];
        people[0] = bob;
        people[1] = zalice;
        people[2] = rob;
        System.out.println(Arrays.toString(people));




    }
}

