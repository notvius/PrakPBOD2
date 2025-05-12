/*
 * File : Anabul.java
 * Deskripsi : kelas abstrak untuk anabul
 */

public abstract class Anabul {
    // Atribut
    private String nama;
    
    // Method-method
    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();

    public abstract void bersuara();
}
