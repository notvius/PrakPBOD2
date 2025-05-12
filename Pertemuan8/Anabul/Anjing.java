/*
 * File : Anjing.java
 * Deskripsi : implementasi Anjing sebagai Anabul
 */

public class Anjing extends Anabul{
    // Atribut

    // Method-method
    public Anjing (String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println( "Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Guk-guk");
    }
}
