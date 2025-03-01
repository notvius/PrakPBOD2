/* Nama File : Dosen.java
 * Deskripsi : berisi main driver class Dosen
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 28-02-2025 
 */

 public class MDosen {
    public static void main(String[] args) {
        // Membuat objek dosen dengan konstruktor default
        Dosen d1 = new Dosen();
        
        // Membuat objek dosen dengan konstruktor berparameter
        Dosen d2 = new Dosen("240123", "Laila Putri", "Informatika");
        
        // Menampilkan data dosen d2 yang sudah diinisialisasi melalui konstruktor
        System.out.println("Dosen d1: ");
        System.out.println("Nip dosen = " + d2.getNip());
        System.out.println("Nama dosen = " + d2.getNama());
        System.out.println("Prodi dosen = " + d2.getProdi());

        // Mengubah data dosen d1 menggunakan setter
        d1.setNip("748293");
        d1.setNama("Fajar Ghafi");
        d1.setProdi("Fisika");
        
        // Menampilkan data dosen d1 setelah diubah melalui setter
        System.out.println("\nDosen d2: ");
        System.out.println("Nip dosen = " + d1.getNip());
        System.out.println("Nama dosen = " + d1.getNama());
        System.out.println("Prodi dosen = " + d1.getProdi());
    }
}

