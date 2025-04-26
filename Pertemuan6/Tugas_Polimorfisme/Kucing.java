// Nama file: Kucing.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

public class Kucing extends Anabul{
    // Atribut

    // Method
    public Kucing (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
}
