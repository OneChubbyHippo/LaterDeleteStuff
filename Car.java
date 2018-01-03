/**
 * Created by winniejeng on 3/22/17.
 */
public class Car {

    private double mpg;
    private double gallons;

    public Car(double mpg) //constructor
    {
        this.mpg = mpg;
        gallons = 0;
    }

    //a car drives uses up fuels
    //a car adds fuel
    //a car shows miles gallon
    //

    public double displayGallons()
    {
        return this.gallons;
    }

    public void drive(double miles)
    {
        double burnedFuel = miles / mpg;
        this.gallons -= burnedFuel;
    }

    public void addFuel(double gas)
    {
        gallons += gas;
    }

}
