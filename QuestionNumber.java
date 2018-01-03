/**
 * Created by winniejeng on 3/31/17.
 */

//Add a class NumericQuestion to the question hierarchy of Section 9.1. If the response
//        and the expected answer differ by no more than 0.01, then accept the response as
//        correct.

public class QuestionNumber extends Question {

    private double difference;
    private double answer;

    QuestionNumber(){
        difference = 0;
    }

    public void setAnswer(double correctNumber)
    {
        answer = correctNumber;
    }

    public boolean checkAnswer(double response)
    {
        difference = Math.abs(response - answer);

        if (difference >=0.01){
            return false;
        }
        return true;
    }

}
