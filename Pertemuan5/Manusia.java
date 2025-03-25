/*
 * File : Manusia.java
 * Name : Novia Putri Yustiana
 * Date : 25 March 2025
 * Desc : Implementation of Manusia class
 */

import java.time.LocalDate;

public abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor dan Mutator
    public String getNama() {
        return this.nama;
    }

    public LocalDate getTanggalMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public double getPendapatan() {
        return this.pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Method
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
    
}