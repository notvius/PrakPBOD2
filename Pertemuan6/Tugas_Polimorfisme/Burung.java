// Nama file: Burung.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

public class Burung extends Anabul {
    // Atribut

    // Method
    public Burung (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }
}
