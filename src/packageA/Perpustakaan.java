package packageA;

public class Perpustakaan {
    // Method untuk mengakses atribut dan method dari class Buku
     public void aksesPerpustakaan() {
        Buku novel = new Buku("Laut Bercerita", 12, "Kepustakaan Populer Gramedia", "9786");

        System.out.println("============ Akses dari Perpustakaan ============");
        System.out.println("Judul buku adalah " + novel.bookTitle);
        System.out.println("Stok buku ada " + novel.getBookStok());
        System.out.println("Penerbit " + novel.penerbit);
        System.out.println("Kode buku adalah " + novel.getBookCode());

        boolean berhasilPinjam = novel.pinjam();
        System.out.println("Pinjam buku " + (berhasilPinjam ? "Berhasil" : "Gagal"));
        System.out.println("Stok setelah buku dipinjam adalah " + novel.getBookStok());

        novel.kembalikan();

        System.out.println("Stok seteleah buku dikembalikan adalah " + novel.getBookStok());
    }
}
