/*Created by winniejeng on 3/27/17.
* Design a class Message that models an e-mail message. A message has a recipient, a
* sender, and a message text. Support the following methods:
*       A constructor that takes the sender and recipient
*       A method append that appends a line of text to the message body
*       A method toString that makes the message into one long string like this: "From:
*                                            Harry Morgan\nTo: Rudolf Reindeer\n . . ."
* Write a program that uses this class to make a message and print it.
 */
public class Email {
    private String sender;
    private String recipient;
    private String text;

    public Email(String sender, String recipient){
        this.sender = sender;
        this.recipient = recipient;
        text = " ";
    }

    public void append(String line){

        text += "\n";
        text += line;

    }

    public String toString(){
        return String.format("From: " + sender + "\nTo: " + recipient + "\n"+ text);
    }
}
