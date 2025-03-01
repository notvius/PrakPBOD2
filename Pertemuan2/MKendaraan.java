/* Nama File : MKendaraan.java
 * Deskripsi : berisi main driver untuk atribut dan method dalam class Kendaraan
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

 public class MKendaraan {
    public static void main(String[] args) {
        // Membuat objek kendaraan dengan konstruktor default
        Kendaraan k1 = new Kendaraan();
        
        // Membuat objek kendaraan dengan konstruktor berparameter
        Kendaraan k2 = new Kendaraan("G 123 B", "Mobil");
        
        // Menampilkan data kendaraan k2 yang sudah diinisialisasi melalui konstruktor
        System.out.println("Kendaraan k2:");
        System.out.println("ID Kendaraan = " + k2.getNoPlat());
        System.out.println("Jenis Kendaraan = " + k2.getJenis());

        // Mengubah data kendaraan k1 menggunakan setter
        k1.setNoPlat("P 046 K");
        k1.setJenis("Motor");
        
        // Menampilkan data kendaraan k1 setelah diubah melalui setter
        System.out.println("\nKendaraan k1:");
        System.out.println("ID Kendaraan = " + k1.getNoPlat());
        System.out.println("Jenis Kendaraan = " + k1.getJenis());
    }
}
