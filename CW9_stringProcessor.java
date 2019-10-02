public class CW9_stringProcessor
{
    public static void main(String[] args)
    {
        withoutEnds("output43");
    }
    public static String withoutEnds(String str)
    {
        return str.substring(1, str.length()-1);
    }
    public static String front2(String str)
    {
        String lastTwo = str.substring(str.length()-2);
        return lastTwo + str.substring(0,str.length()-2);
    }
    public static String firstFour(String str)
    {
        if (str.length()==0)
        return str.substring(0,str.length());
        if (str.length()==1)
        return str.substring(0,str.length()) + "###";
        if (str.length()==2)
        return str.substring(0,str.length()) + "##";
        if (str.length()==3)
        return str.substring(0,str.length()) + "#";
        else
        {
        return str.substring(0,4);
        }
    }
    public static String findAt(String str)
    {
        int i = str.indexOf("@");
        while(i >= 0) {
            System.out.println(i);
            i = str.indexOf("@", i+1);
        }
        return "yes:";
    }
}