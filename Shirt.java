public class Shirt
{
    private String sleeves;
    private String style;
    
    public Shirt()
    {
        sleeves = "Short";
        style = "Plaid";
    }
    
    public Shirt(String sl, String st)
    {
        sleeves = this.sleeves;
        style = this.style;
    }
    public String getSleeves()
    {
        return sleeves;
    }
    public String getStyle()
    {
        return style;
    }
    public void setSleeves(String sl)
    {
        sleeves = sl;
    }
    public void setStyle(String st)
    {
        style = st;
    }
    public String toString()
    {
    return "Sleeves: " + sleeves + " " + "Style: " + style;
    }
}