/**
 * Created by winniejeng on 3/24/17.
 */
public class PersonInheritorsDaughter extends PersonInheritor {

    //Constructor
    public PersonInheritorsDaughter(String name) {
        super(name); //calls the superclass Constructor and its parameter
    }

    @Override
    public void introduce()
    {
        super.introduce();
        System.out.println("Meine bruder ist verrückt"); // instead of carrying over "name," can use "getName()"
    }

    @Override
    public String getMajor() {
        return "My major is Integrated Biology";
    }
}
