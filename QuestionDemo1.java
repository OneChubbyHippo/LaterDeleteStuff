import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/

public class QuestionDemo1
{
   public static void main(String[] args)
   {
      String response = "";
      Scanner in = new Scanner(System.in);
//      Question q = new Question();
//      q.setText("Who was the inventor of Java?");
//      q.setAnswer("James Gosling");
//
//      q.display();
//      System.out.print("Your answer: ");
//      String response = in.nextLine();
//      System.out.println(q.checkAnswer(response));
//
//      System.out.println();

//      Question q2 = new Question();
//      q2.setText("What is the best thing in the world?");
//      q2.setAnswer("love");
//
//      q2.display();
//      System.out.print("Your answer: ");
//      response = in.nextLine();
//      System.out.println(q2.checkAnswer(response));
//
//      System.out.println();
//
//      QuestionNumber q3 = new QuestionNumber();
//      q3.setText("What is the resultant value of 3+3?");
//      q3.setAnswer(6);
//      q3.display();
//      System.out.println("Your answer: ");
//      double val = in.nextDouble();
//      System.out.println(q3.checkAnswer(val));

      QuestionFill q4 = new QuestionFill();
      q4.setQandA("The best website is ______ and not Wikipedia");
      q4.display();


   }
}

