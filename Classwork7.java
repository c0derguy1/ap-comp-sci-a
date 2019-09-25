import java.util.Random;
import java.util.Scanner;
public class Classwork7
{
public static void main(String[] args)
{
    System.out.print(findSum(2,3));
    Random random = new Random();
    int n = random.nextInt(85);
    
    System.out.print(canIvote((int) n));
    System.out.print("\n" + (int) n);
}
public static double findSum(int a, int b)
{
    return a+b;
}

public static String canIvote(int age)
{
if (age>= 18)
{
  return "\nye";
}
else
{
  return "\nheck no";
}
}

public static String MathQuiz(int answer)
{
    Random randprob = new Random();
    int rand1 = randprob.nextInt(15);
    int rand2 = randprob.nextInt(20);
    System.out.println("What is " + rand1 + "+ " + rand2 + "?");
    Scanner scan = new Scanner();
    
}
}