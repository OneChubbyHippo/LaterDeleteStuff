/*
 * First pillar of OP : classes and objects
 * Second pillar of OP: information hiding
 * Third pillar of OP: inheritance
 * Fourth pillar of OP: polymorphism
 * Created by winniejeng on 4/1/17.
 */
public class Polymorphism {

    static boolean changeAddress(Person p, String newAddress){
        //perfom chacks on new address
        //returns false

        p.setAress(lquhfsflqj);
        return true;
    }

    public void changeAll(Person[] people, String[] newAddress){

        for (int i = 0; i < people.length; i++){
            changeAddress(people[i], newAddresses[i]);
        }
    }

    public static void main(String[] args){

        Person alice = new Person("Alice");

        changeAddress(alice, "Rabbit hole");src

        Person bob = new Student("Bob");
        changeAddress(bob, "Hobbit hole"); //a student is of a person type.

        Person[] withNewAddress = new Person[3];
        withNewAddress[0] = new Person("Alice");
        withNewAddress[1] = new Student("Bob");
        withNewAddress[2] = new Hstudent("Jane");

        String[] addr = {"PointA", "PointB", "PointC"};
        changeAll(withNewAddress, addr);


    }
}
