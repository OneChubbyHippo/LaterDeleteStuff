/**
 * Created by winniejeng on 3/24/17.
 */
public class PersonDemo {

    public static void main(String[] args){

        //Pretty standard. Construct a object of the superclass. Call methods through the object
        Person p1 = new Person("Alice");
        System.out.println(p1.getName());
        System.out.println(p1.getSsn());
        p1.introduce();
        System.out.println();

        //If count is "public static," then clients can break order. And it gives false impression to client that p1 not static
        //Like the following:
        //p1.count=0;

        //Pretty standard still. Notice that the ssn increments.
        Person p2 = new Person("Bob");
        System.out.println(p2.getName());
        System.out.println(p2.getSsn());
        p2.introduce();

        System.out.println();

        //Construct an object of the subclass PersonInheritor
        PersonInheritor bill = new PersonInheritor("Bill");
        System.out.println(bill.getName());
        System.out.println(bill.getSsn());
        bill.setSemesterUnits(15); //A method introduced in the subclass but not in the superclass
        System.out.println(bill.getSemesterUnits());
        System.out.println(bill.getMajor());
        bill.introduce(); //Override at works

        System.out.println();

        //Construct an object of the sub-subclass PersonInheritorsDaughter
        PersonInheritorsDaughter cassie = new PersonInheritorsDaughter("Cassie");
        System.out.println(cassie.getName());
        System.out.println(cassie.getSsn());
        cassie.setSemesterUnits(16);
        System.out.println(cassie.getSemesterUnits());
        System.out.println(cassie.getMajor()); //Override at works
        cassie.introduce();

        System.out.println();

        //Substitution principle: superclass type, but PersonInheritor behavior
        Person winnie = new PersonInheritor("Winnie");
        System.out.println(winnie.getName());
        System.out.println(winnie.getSsn());
        winnie.introduce();
        //what is the purpose of instance of again?
        if (winnie instanceof PersonInheritor) {
            System.out.println( ( (PersonInheritor) winnie).getMajor() ); //Casting
        }
        //Fragen: how to call an overridden method in the superclass Person to revert introduce() back?

        System.out.println();

        //Same principle
        Person hannah = new PersonInheritorsDaughter("Hannah");
        System.out.println(hannah.getName());
        System.out.println(hannah.getSsn());
        hannah.introduce();
        System.out.println(((PersonInheritorsDaughter) hannah).getMajor()); //Casting
    }
}
