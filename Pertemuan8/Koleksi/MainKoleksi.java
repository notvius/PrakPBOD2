/*
 * File : MainKoleksi.java
 * Deskripsi : main class untuk Koleksi
 */

public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        System.out.println("=== DEMONSTRASI APLIKASI KOLEKSI KARAKTER ===");
        
        // Menambahkan 10 karakter ke dalam koleksi
        System.out.println("\nMenambahkan 10 karakter ke dalam koleksi...");
        koleksiKarakter.add('P');
        koleksiKarakter.add('R');
        koleksiKarakter.add('O');
        koleksiKarakter.add('G');
        koleksiKarakter.add('R');
        koleksiKarakter.add('A');
        koleksiKarakter.add('M');
        koleksiKarakter.add('M');
        koleksiKarakter.add('I');
        koleksiKarakter.add('N');

        // Tampilkan semua elemen
        System.out.println("\nMenampilkan semua elemen koleksi:");
        koleksiKarakter.showAll();

        // Edit elemen ke-9
        System.out.println("\nMengubah elemen pada indeks 9 dari '" + koleksiKarakter.getIsi(9) + 
                         "' menjadi 'G'");
        koleksiKarakter.setIsi(9, 'G');

        // Hapus elemen ke-6
        System.out.println("Menghapus elemen pada indeks 0");
        koleksiKarakter.delete(0);

        // Demonstrasi getSize
        System.out.println("Jumlah elemen saat ini: " + koleksiKarakter.getSize());

        // Demonstrasi setSize (mengurangi jumlah elemen)
        System.out.println("Mengubah jumlah elemen menjadi 5");
        koleksiKarakter.setSize(5);

        // Mencoba menambahkan elemen baru setelah setSize
        System.out.println("\nMenambahkan elemen baru setelah setSize:");
        System.out.println("Menambahkan elemen 'J'");
        koleksiKarakter.add('J');
        System.out.println("Menambahkan elemen 'V'");
        koleksiKarakter.add('V');

        /// Menampilkan koleksi final
        System.out.println("\nKoleksi final:");
        koleksiKarakter.showAll();
        
        System.out.println("\n=== DEMONSTRASI SELESAI ===");
    }
}
