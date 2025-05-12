/*
 * File : Burung.java
 * Deskripsi : implementasi Burung sebagai Anabul
 */

public class Burung extends Anabul {
    // Atribut

    // Method
    public Burung (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Terbang");
    }

    @Override
    public void bersuara() {
        System.out.println("Cuit");
    }
}
