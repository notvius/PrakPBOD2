// Nama file: Anjing.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

public class Anjing extends Anabul{
    // Atribut

    // Method-method
    public Anjing (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println( "Melata.");
    }

    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }
}
