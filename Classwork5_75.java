import java.util.Scanner;

public class Classwork5_75
{
   public static void main(String[] args)
   {
       
           System.out.println("How many sides do you want your dice to have?");
           Scanner sides = new Scanner(System.in);
           int sidez = sides.nextInt();
           if (sidez>0)
           {
               System.out.println("You rolled a/an " + (int)(Math.random()*sidez+1));
           }
           else
           {
                System.out.println("Invalid entry.");
           }
        }
    }