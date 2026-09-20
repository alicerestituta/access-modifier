package packageB;

class Anggota {
    // Atribut dengan berbagai access modifier
    public String nama;
    protected String nomorAnggota;
    int jumlahPinjaman;
    private String password;

    // Constructor
    public Anggota(String nama, String nomorAnggota, int jumlahPinjaman, String password) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.jumlahPinjaman = jumlahPinjaman;
        this.password = password;
    }

    // Method public buat akses data private
    public boolean cekPassword(String input) {
        return this.password.equals(input);
    }
}

class Petugas {
    // Method untuk mengakses atribut dari class Anggota
    public void periksaAnggota(Anggota anggota) {
        System.out.println("=== Simulasi Akses oleh Petugas ===");
        System.out.println("Nama (Public)        : " + anggota.nama); 
        System.out.println("No Anggota (Protected): " + anggota.nomorAnggota); 
        System.out.println("Pinjaman (Default)   : " + anggota.jumlahPinjaman); 
    }
}

public class Pengunjung {
    public static void main(String[] args) {
        // Membuat objek Anggota dan Petugas
        Anggota anggota1 = new Anggota("Budi Santoso", "P-007", 3, "sandiRahasia");
        Petugas petugas = new Petugas();
        
        petugas.periksaAnggota(anggota1);
        
        System.out.println("\n=== Simulasi Akses langsung dari Pengunjung (Main Method) ===");
        System.out.println("Nama (Public)        : " + anggota1.nama);
        System.out.println("No Anggota (Protected): " + anggota1.nomorAnggota);
        System.out.println("Pinjaman (Default)   : " + anggota1.jumlahPinjaman); 
        
        // Pengunjung/Petugas tetap bisa mengecek password lewat method public
        System.out.println("Status Password      : " + 
            (anggota1.cekPassword("sandiRahasia") ? "Cocok" : "Salah"));
    }
}