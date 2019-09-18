import java.util.Scanner;
import java.util.Random;

public class Classwork5_5
{
public static void main (String[] args)
{
    for(int i = 0; i < 50; i +=1)
    {
    System.out.println("Ask me a question.");
    Scanner qreader = new Scanner(System.in);
    String question = qreader.nextLine();
    String answers[] = {"It is certain", "It is decidedly so", "Without a doubt",
            "Yes - definitely", "You may rely on it", "As I see it, yes",
            "Most likely", "Outlook good", "Signs point to yes",
            "Yes", "Reply hazy, try again", "Ask again later",
            "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
            "Don't count on it", "My reply is no", "My sources say no",
            "Outlook not so good", "Very doubtful"};
        Random r=new Random();
        int randomNumber=r.nextInt(answers.length);
        System.out.println(answers[randomNumber]);
    }
}

}