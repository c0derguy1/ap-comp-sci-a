public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book("Hello", "Ms. Kennedy", 150);
        System.out.println(b1.getTitle());
        b1.setTitle("Chicken Chronicles");
        System.out.println(b1.getTitle());
        b1.setAuthor("GG");
        System.out.println(b1.getAuthor());
        b1.setPages(12);
        System.out.println(b1.getPages());
        System.out.println(b1.toString());
    }
}
