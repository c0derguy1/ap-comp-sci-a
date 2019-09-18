public class Classwork5
{
    public static void main(String[] args)
    {
        ///for(int i = 0; i < 10; i += 1)
        {
            double randNum1 = (int)(Math.random()*6+1);
            double randNum2 = (int)(Math.random()*6+1);
            double result = (int)(randNum1 + randNum2);
            if (result == 7 || result == 11)
            {
            System.out.println("You win! You rolled a " + result);
            }
            else if(result == 2.0 || result == 3.0 || result == 12.0)
            {
            System.out.println("You lose! You rolled a " + result);
            }
            else
            {
            System.out.println("Keep playing! You rolled a " + result);
            }
            //System.out.println("Your program just rolled a " + randNum1);
        }
    }
}