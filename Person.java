/**
 * Created by winniejeng on 3/24/17.
 */
public class Person {
//    //A public final variable can be accessed by clients, but not changed
//    public static final double PI = 3.14;
    private static int count; //this works, but this is not what we're trying to achieve in an oop class
    private int ssn;
    protected String name; //what 'protected' means is 'me and my descendants can access"

    //Constructor
    public Person(String name) {
        this.ssn = ++count;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSsn() {
        return ssn;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name);
    }

}
