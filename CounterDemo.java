/**
   This class demonstrates the Counter class.
*/
public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter tally = new Counter();

      for (int i = 0; i < 10 ; i++)
      {
         tally.setValue();
      }

      for (int i =0; i < 12; i++)
      {
         tally.undo();
      }


      int result = tally.getValue();
      System.out.println("Value: " + result);


   }
}
