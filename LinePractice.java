/**
 * Created by winniejeng on 3/18/17.
 */
public class LinePractice {

    private PointPractice p1;
    private PointPractice p2;

    public LinePractice(PointPractice p1, PointPractice p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }


    public double getLength(){
        return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)
                + Math.pow(p1.getY()-p2.getY(), 2));

    }

    public void shiftX(int by)
    {
        p1.shiftX(by);
        p2.shiftX(by);
    }

    public void shiftY(int by)
    {
        p1.shiftY(by);
        p2.shiftY(by);
    }
}
