// Nama file: Manajer.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

public class Manajer extends Pegawai{
    // Atribut
    private int tunjangan = 700000;

    // Method-method
    public Manajer(String nama) {
        this.nama = nama;
    }

    @Override
    public void tampilData () {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}


