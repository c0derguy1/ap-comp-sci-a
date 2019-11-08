import java.util.Random;
public class Poke
{
    private double HP;
    private double attack;
    private double defense;
    private double spAttack;
    private double spDefense;
    private double speed;
    
    public Poke(double h, double a, double d, double spa, double spd, double spe)
    {
        HP = h;
        attack = a;
        defense = d;
        spAttack = spa;
        spDefense = spd;
        speed = spe;
    }
    public void SwordsDance()
    {
        attack = 2 * attack;
    }
    public void BulkUp()
    {
        attack = 1.5 * attack;
        defense = 1.5 * defense;
    }
    public double getSpeed()
    {
        return speed;
    }
    public boolean sameSpeed(Poke p)
    {
        if(speed == p.getSpeed())
        {
             Poke[] arr = {this, p};
             Random random = new Random();

             // randomly selects an index from the arr
             int select = (int)((Math.random())*(arr.length-1)); 

             // prints out the value at the randomly selected index
             System.out.println(arr[select] + " will move first."); 
            return true;
        }
        else
        return false;
    }
}