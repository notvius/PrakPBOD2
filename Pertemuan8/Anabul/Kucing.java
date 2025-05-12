/*
 * File : Kucing.java
 * Deskripsi : implementasi Kucing sebagai Anabul
 */

public class Kucing extends Anabul{
    // Atribut

    // Method
    public Kucing (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Meong");
    }
}
