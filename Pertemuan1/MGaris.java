/* Nama File : MGaris.java
 * Deskripsi : Menjalankan method dalam class Garis
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 22-02-2025 
 */

public class MGaris {
    public static void main(String[] args) {
        // Garis 1
        System.out.println("Garis 1:");
        Garis g1 = new Garis();
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);
        g1.printGaris();
        t1.setAbsis(8);
        t1.setOrdinat(-2);
        t2.setAbsis(1);
        t2.setOrdinat(5);
        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);
        g1.printGaris();

        // Garis 2
        System.out.println("\nGaris 2:");
        Titik t3 = new Titik(2, 3);
        Titik t4 = new Titik(4, 0);
        Garis g2 = new Garis(t3, t4);
        g2.printGaris();

        // Menghitung jarak Garis g1 dari pusat
        System.out.println("\nPanjang Garis g1 = " + g1.getPanjang());

        // Mendapatkan gradien dari sebuah garis
        System.out.println("Gradien Garis g1 = " + g1.getGradien());

        // Mendapatkan titik tengah dari sebuah garis
        System.out.println("Titik tengah dari garis g1 = " + g1.getTitikTengah());

        // Mengecek apakah objek garis sejajar dengan sebuah garis lainnya
        System.out.println("Apakah Garis g1 dan garis G2 sejajar? " + g1.isSejajar(g2));
        
        // Mengecek apakah objek garis tegak lurus dengan sebuah garis lainnya
        System.out.println("Apakah Garis g1 dan garis G2 tegak lurus? " + g1.isTegakLurus(g2));

        // Menampilkan persamaan garis dalam bentuk string y = mx + c
        System.out.println("Persamaan garis g1 : " + g1.getPersamaanGaris());
    }
}
