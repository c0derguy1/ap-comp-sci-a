public class Buttons extends Shirt
{
    private int Number;
    
    public Buttons()
    {
        super();
        Number = 6;
    }
    public void swim()
    {
        String sl = getSleeves();
        String st = getStyle();
        super.setSleeves(sl);
        super.setStyle(st);
    }
    public Buttons(int Number)
    {
        super(sleeves, style); // constructor for Shirt class
        this.Number = Number;
    }
    public String toString()
    {
        return super.toString() + "# of buttons: " + Number;
    }
}