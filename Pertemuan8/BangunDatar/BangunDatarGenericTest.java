/*
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic bangun datar
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("Luas lingkaran: " + bdg.hitungLuas());
        
        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);
        System.out.println("\nKeliling persegi: " + bdg2.hitungKeliling());
        System.out.println("Luas persegi: " + bdg2.hitungLuas());
        
        PersegiPanjang pp = new PersegiPanjang(3, 4);
        BangunDatarGeneric<PersegiPanjang> bdg3 = new BangunDatarGeneric<PersegiPanjang>();
        bdg3.set(pp);
        System.out.println("\nKeliling persegi panjang: " + bdg3.hitungKeliling());
        System.out.println("Luas persegi panjang: " + bdg3.hitungLuas());
        
        Segitiga s = new Segitiga(3, 4, 5);
        BangunDatarGeneric<Segitiga> bdg4 = new BangunDatarGeneric<Segitiga>();
        bdg4.set(s);
        System.out.println("\nKeliling segitiga: " + bdg4.hitungKeliling());
        System.out.println("Luas segitiga: " + bdg4.hitungLuas());
    }
}
