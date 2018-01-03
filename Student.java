/**
 * Created by winniejeng on 3/31/17.
 */
//Implement a superclass Person. Make two classes, Student and Instructor, that inherit
//        from Person. A person has a name and a year of birth. A student has a major, and
//        an instructor has a salary. Write the class declarations, the constructors, and the
//        methods toString for all classes. Supply a test program that tests these classes and
//        methods.
public class Student extends Person{

    private String major;

    public Student(String name, int dob, String major){
        super(name,dob);
        this.major = major;
    }
    public void setMajor(String major){
        this.major = major;
    }

    @Override
    public String toString(){
        return super.getName() + " majors in " + major ;
    }
}
