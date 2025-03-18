/*
 * File : Tendik.java
 * Name : Novia Putri Yustiana
 * Date : 17 March 2025
 * Desc : Implementation of Tendik class
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() { return bidang; }
    public void setBidang(String bidang) { this.bidang = bidang; }

    public double hitungTunjangan() {
        return 0.01 * (ChronoUnit.YEARS.between(TMT, LocalDate.now())) * gajiPokok;
    }

    public LocalDate hitungBUP() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).withMonth(6);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama   : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir.format(formatter));
        System.out.println("TMT   : " + TMT.format(formatter));
        System.out.println("Bidang  : " + bidang);
        System.out.println("Jabatan  : Tenaga Kependidikan");
        System.out.println("Masa Kerja  : " + hitungMasaKerja());
        System.out.println("BUP   : " + hitungBUP().format(formatter));
        System.out.println("Gaji Pokok  : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan  : 1% x " + hitungMasaKerjaDalamTahun() + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}