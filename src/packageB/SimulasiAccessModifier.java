package packageB;
import packageA.Buku;

class BukuDigital extends Buku { // Subclass dari Buku di packageA
    public BukuDigital(String bookTitle, int bookStok, String penerbit, String bookCode) { 
        super(bookTitle, bookStok, penerbit, bookCode); 
    }

    // Skenario dengan subclass di package berbeda
    public void tampilkanInfo() { 
        System.out.println("Judul Buku: " + bookTitle);   // Tidak error karena atribut memiliki access modifier bersifat public
        System.out.println("Stok Buku: " + bookStok);    // Tidak error karena subclass dapat mengakses atribut yang memiliki access modifier protected dari superclass Buku
        System.out.println("Penerbit: " + penerbit);    // Error karena atribut memiliki access modifier bersifat default dan berada di package yang berbeda
        System.out.println("Kode Buku: " + bookCode);    // Error karena atribut memiliki access modifier bersifat private dan tidak dapat diakses dari subclass
    }
}

public class SimulasiAccessModifier {
    public static void main(String[] args) {
        Anggota anggota = new Anggota("Siti Aminah", "P-010", 2, "rahasia123");

        // Skenario dengan package yang sama
        System.out.println("Nama Anggota: " + anggota.nama);            // Tidak error karena atribut memiliki access modifier bersifat public
        System.out.println("Nomor Anggota: " + anggota.nomorAnggota);    // Tidak error karena atribut memiliki access modifier bersifat protected dan berada di package yang sama
        System.out.println("Banyak Pinjaman: " + anggota.jumlahPinjaman);  // Tidak error karena atribut memiliki access modifier bersifat default dan berada di package yang sama
        System.out.println("Password: " + anggota.password);        // Error karena atribut memiliki access modifier bersifat private dan tidak dapat diakses dari luar kelas

        Buku novel = new Buku("Laut Bercerita", 12, "KPG", "9786");

        // Skenario 3 dengan beda package + bukan subclass
        System.out.println("Judul (Public)        : " + novel.bookTitle);         // Tidak error karena atribut memiliki access modifier bersifat public
        System.out.println("Stok (Protected)      : " + novel.bookStok);          // Error karena atribut memiliki access modifier bersifat protected dan bukan subclass
        System.out.println("Penerbit (Default)    : " + novel.penerbit);          // Error karena atribut memiliki access modifier bersifat default dan berada di package yang berbeda
        System.out.println("Kode (Private)        : " + novel.bookCode);          // Error karena atribut memiliki access modifier bersifat private dan tidak dapat diakses dari luar kelas
    }
}
