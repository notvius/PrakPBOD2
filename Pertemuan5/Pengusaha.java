/*
 * File : Pengusaha.java
 * Name : Novia Putri Yustiana
 * Date : 25 March 2025
 * Desc : Implementation of Pengusaha class
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    // Atribut
    private String npwp;
    private static int counterPengusaha = 0;

    // Konstruktor
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor dan Mutator
    public String getNPWP() {
        return this.npwp;
    }

    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) (ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 5);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}
