// Nama file: Anabul.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

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
