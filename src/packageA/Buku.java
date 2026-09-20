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

    // Getter untuk atribut private
    public int getBookStok(){
        return bookStok;
    }

    public String getPenerbit(){
        return penerbit;
    }

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
