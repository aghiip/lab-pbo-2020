
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    
    public Book(String bookAuthor, String bookTitle, int pages, String refNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = 0;
        refNumber = ("");
    }
    
    /* method Accessor ini yang digunakan untuk mengembalikan nama author*/
    public String getAuthor()
    {
        return author;
    }
    
    /* method Accessor ini yang digunakan untuk mengembalikan nama title*/
    public String getTitle()
    {
        return title;
    }    
    
    /*method untuk menampilkan author*/
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /*method untuk menampilkan tittle*/
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /* method Accessor ini yang digunakan untuk mengembalikan jumlah page*/
    public int getPages()
    {
        return pages;
    }
    
    /*method ini digunakan untuk menampilkan author, title, pages dan juga kondisi*/
    public void printDetails()
    {
        System.out.println(author);
        System.out.println(title);
        System.out.println(pages);
        if(refNumber == ("")) {
            System.out.println("zzz");
        }
        else {
            System.out.println(refNumber);
        }
    }
    
    /* method ini digunakan untuk mengubah nilai dari keadaan objek*/
    public void setRefNumber(String ref)
    {
        refNumber = ref;
    }
}
