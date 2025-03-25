/*
 * File : PNS.java
 * Name : Novia Putri Yustiana
 * Date : 25 March 2025
 * Desc : Implementation of PNS class
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak{
    // Atribut
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor dan Mutator
    public String getNIP() {
        return this.nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    // Method
    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) (ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 4);
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
