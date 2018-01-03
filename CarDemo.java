/**
 * Created by winniejeng on 3/22/17.
 */
public class CarDemo {
    public static void main (String[] args)
    {
        double gasLevel;
        double milesPerGallon = 0;
        Car prius = new Car(50);

        prius.addFuel(200);
        prius.drive(100);

       gasLevel = prius.displayGallons();

        System.out.println(gasLevel);
    }
}
