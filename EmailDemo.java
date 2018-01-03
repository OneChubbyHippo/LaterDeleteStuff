/**
 * Created by winniejeng on 3/27/17.
 */
public class EmailDemo {

    public static void main (String[] args){
        Email msg = new Email("Winnie", "the Yeh's");

        msg.append("Hi my dearest friends. How are you?");
        msg.append("How has the training been for you?");
        msg.append("Are you still learning German?");
        System.out.println(msg.toString());
    }
}
