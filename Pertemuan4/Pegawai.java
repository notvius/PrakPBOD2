/*
 * File : Pegawai.java
 * Name : Novia Putri Yustiana
 * Date : 17 March 2025
 * Desc : Implementation of pegawai class
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Locale;
 
class Pegawai {
    protected String NIP, nama;
    protected LocalDate tanggalLahir, TMT;
    protected double gajiPokok;
    protected static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
 
    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
    }

    // Getters and Setters
    public String getNIP() { return NIP; }
    public void setNIP(String NIP) { this.NIP = NIP; }
    
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public void setTanggalLahir(LocalDate tanggalLahir) { this.tanggalLahir = tanggalLahir; }
    
    public LocalDate getTMT() { return TMT; }
    public void setTMT(LocalDate TMT) { this.TMT = TMT; }
    
    public double getGajiPokok() { return gajiPokok; }
    public void setGajiPokok(double gajiPokok) { this.gajiPokok = gajiPokok; }
 
    public String hitungMasaKerja() {
        Period period = Period.between(TMT, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }
 
    public int hitungMasaKerjaDalamTahun() {
        return (int)ChronoUnit.YEARS.between(TMT, LocalDate.now());
    }
 
    public void printInfo() {
        System.out.println("NIP   : " + NIP);
    }
 }
 