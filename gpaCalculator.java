/**
 * Created by winniejeng on 3/23/17.
 */
//    Modify the Student class of Exercise P8.7 to compute grade point averages. Methods
//    are needed to add a grade and get the current GPA. Specify grades as elements of a
//    class Grade. Supply a constructor that constructs a grade from a string, such as "B+".
//    You will also need a method that translates grades into their numeric values (for
//    example, "B+" becomes 3.3).

public class gpaCalculator {

    private String grade;
    private double gpa;

    public gpaCalculator()
    {
        this.grade = "F";
        this.gpa = 0;
    }

    public gpaCalculator(String grade)
    {
        this.grade = grade;
        this.gpa = 0;
    }

    public void setGpa(String grade)
    {
        this.grade=grade;
    }

    public void gradeToGPA()
    {
        char gradeLetter = this.grade.charAt(0);
        char gradeSign = ' ';

        switch(gradeLetter)
        {
            case 'A': gpa = 4; break;
            case 'B': gpa = 3; break;
            case 'C': gpa = 2; break;
            case 'D': gpa = 1; break;
            case 'F': gpa = 0; break;
            default:
                System.out.println("Invalid grade letter");
        }

        if (this.grade.length()==2)
        {
            gradeSign = grade.charAt(1);

            switch(gradeSign)
            {
                case '+': gpa += 0.3; break;
                case '-': gpa -= 0.3; break;
                default:
                    System.out.println("Invalid grade sign");
            }
        }
    }

    public double getGPA()
    {
        this.gradeToGPA();
        return gpa;
    }
}