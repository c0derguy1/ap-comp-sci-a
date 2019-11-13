public class Book
{
    private String title;
    private String author;
    private int pages;
    public Book(String t, String a, int p)
    {
        title = t;
        author = a;
        pages = p;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public String setTitle(String t)
    {
        title = t;
        return title;
    }
    public String setAuthor(String a)
    {
        author = a;
        return author;
    }
    public int setPages(int p)
    {
        pages = p;
        return pages;
    }
}