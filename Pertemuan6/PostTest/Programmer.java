// Nama file: Programmer.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

public class Programmer extends Pegawai{
    // Atribut
    private int bonus = 450000;

    // Method-method
    public Programmer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}



