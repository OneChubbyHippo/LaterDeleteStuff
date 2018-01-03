/**
   This class models a tally counter.
*/
//public class Counter
//{
//   //PRIVATE DATA (variables)
//   private int value;
//
//
//   //PUBLIC INTERFACE (methods)
//   /**
//      Gets the current value of this counter.
//      @return the current value
//   */
//   public int getValue() { return value; }
//
//   /**
//      Advances the value of this counter by 1.
//   */
//   public void count()
//   {
//      value = value + 1;
//   }
//
//   /**
//      Resets the value of this counter to 0.
//   */
//   public void reset()
//   {
//      value = 0;
//   }
//}

public class Counter{

   private int value;

   public void setValue()
   {
      value +=1;
   }

   public int getValue()
   {
      return value;
   }

   public void reset()
   {
      value=0;
   }

   public void undo()
   {
      if (value > 0) //Invariant=0; never goes backward
      {
         value -= 1;
      }
   }
}