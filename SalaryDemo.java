import java.util.Scanner;

/**
   This program demonstrates polymorphism by applying a method
   to objects of different classes.
*/
public class SalaryDemo
{
   public static void main(String[] args)
   {
      Employee[] staff = new Employee[3];
      staff[0] = new HourlyEmployee("Morgan, Harry", 30);
      staff[1] = new SalariedEmployee("Lin, Sally", 52000); 
      staff[2] = new Manager("Smith, Mary", 104000, 50);
      
      Scanner in = new Scanner(System.in);
      for (Employee each : staff)
      {
         System.out.print("Hours worked by " + each.getName() + ": ");
         int hours = in.nextInt();
         System.out.println("Salary: " + each.weeklyPay(hours));
      }
   }
}
