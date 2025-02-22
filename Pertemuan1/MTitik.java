/* Nama File : MTitik.java
 * Deskripsi : Menjalankan method dalam class Titik
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 22-02-2025 
 */

public class MTitik {
    public static void main(String[] args) {
        // Titik t1
        System.out.println("Titik t1:");
        Titik t1 = new Titik(); // Membuat objek titik t1 (0,0)
        t1.setAbsis(3); // Mengubah absis t1 dengan nilai 3
        t1.setOrdinat(4); // Mengubah ordinat t1 dengan nilai 4
        t1.printTitik(); // Mencetak koordinaat t1 ke layar
        t1.geser(3, 4); // Menggeser t1 sejauh (3, 4)
        t1.printTitik(); // Menampilkan koordinat t1 setelah digeser

        // Titik t2 
        System.out.println("\nTitik t2:");
        Titik t2 = new Titik(2, 3); // Membuat objek titik t2 (2,3)
        t2.printTitik(); // Mencetak koordinaat t2 ke layar
        t2.setAbsis(-1); // Mengubah absis t2 dengan nilai -1
        t2.setOrdinat(10); // Mengubah ordinat t2 dengan nilai 10
        t2.printTitik(); // Mencetak koordinaat t2 setelah diubah ke layar

        // Hitung jumlah objek Titik yang sudah dibuat
        System.out.println("\nJumlah Objek Titik = " + Titik.getCounterTitik());

        // Titik t2 berada di kuadran
        System.out.println("Titik t2 berada di Kuadran = " + t2.getKuadran());

        // Jarak antara Titik pusat dan Titik t1
        System.out.println("Jarak antara Titik pusat dengan Titik t1 = " + t1.getJarakPusat());

        // Jarak antara Titik t1 dan Titik t2
        System.out.println("Jarak antara Titik t1 dengan Titik t2 = " + t1.getJarak(t2));
    
        // Hasil refleksi Titik terhadap sumbu X
        t1.refleksiX();
        System.out.println("Titik t1 setelah direfleksikan terhadap sumbu X = (" + t1.absis + ", " + t1.ordinat + ")");

        // Hasil refleksi Titik terhadap sumbu y
        t2.refleksiY();
        System.out.println("Titik t2 setelah direfleksikan terhadap sumbu Y = (" + t2.absis + ", " + t2.ordinat + ")");

        // Menghasilkan Titik baru yang merupakan refleksi Titik t1
        Titik t3 = new Titik();
        t3 = t1.getRefleksiX();
        System.out.println("Titik t3 merupakan hasil refleksi terhadap sumbu X Titik t1 = (" + t3.absis + ", " + t3.ordinat + ")");
        
        // Menghasilkan Titik baru yang merupakan refleksi Titik t2
        Titik t4 = new Titik();
        t4 = t2.getRefleksiY();
        System.out.println("Titik t4 merupakan hasil refleksi terhadap sumbu Y Titik t2 = (" + t4.absis + ", " + t4.ordinat + ")");
    }
}
