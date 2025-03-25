/*
 * File : Petani.java
 * Name : Novia Putri Yustiana
 * Date : 25 March 2025
 * Desc : Implementation of Petani class
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0;

    // Konstruktor
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor dan Mutator
    public String getAsalKota() {
        return this.asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) (ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 1);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}
