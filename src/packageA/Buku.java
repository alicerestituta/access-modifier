package packageA;

public class Buku {
    // Atribut dengan berbagai access modifier
    public String bookTitle;
    protected int bookStok;
    String penerbit;
    private String bookCode;

    // Constructor
    public Buku(String bookTitle, int bookStok, String penerbit, String bookCode) {
        this.bookTitle = bookTitle;
        this.bookStok = bookStok;
        this.penerbit = penerbit;
        this.bookCode = bookCode;
    }

    // Getter untuk atribut protected
    public int getBookStok(){
        return bookStok;
    }

    // Getter untuk atribut default
    public String getPenerbit(){
        return penerbit;
    }

    // Getter untuk atribut private
    public String getBookCode(){
        return bookCode;
    }
    
    public boolean pinjam(){
        if (bookStok > 0){
            bookStok--;
            return true;
        }
        return false;
    }

    public void kembalikan(){
        bookStok++;
    }
}
