/**
 * Created by winniejeng on 3/24/17.
 */
public class PersonInheritor extends Person {

    private int semesterUnits;

    //Constructor
    public PersonInheritor(String name) {
        super(name); //use "super" to call a super class constructor and its parameter "name"
        semesterUnits = 0;
    }


    //a subclass method takes in a parameter int semesterUnits from the user.
    public void setSemesterUnits(int semesterUnits) {
        this.semesterUnits = semesterUnits;
    }

    public int getSemesterUnits() {
        return semesterUnits;
    }

    public String getMajor() {
        return "My major is EEC";
    }

    @Override //annotation is good for stopping you from making a mistakes
    public void introduce() {
        System.out.println("Hallo, ich heiße " + name); // instead of carrying over "name," can use "getName()"
    }



}
