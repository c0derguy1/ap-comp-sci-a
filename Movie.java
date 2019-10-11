public class Movie
{
    //instance variables = movie adjectives
 public String title;
 private String genre;
 public double lengthInMin;
 
 //constructor definition
 public Movie(String titl, String gen, double len)
 {
     title = titl;
     genre = gen;
     lengthInMin = len;
    }
    
    //mutator method for changing private name
    public void setTitle(String t)
    {
        title = t;
    }
    //accessor method for accessing the private data
    public String getTitle()
    {
        return title;
    }
    //complete this class to include accessor and mutator methods for the genre and the length
    //the genre and the length
    public void setGenre(String g)
    {
        genre = g;
    }
    public String getGenre()
    {
        return genre;
    }
    public void setLength(double l)
    {
        lengthInMin=l;
    }
    public double getlength()
    {
        return lengthInMin;
    }
    
}