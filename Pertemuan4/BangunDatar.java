/*
 * File : bangunDatar.java
 * Name : Novia Putri Yustiana
 * Date : 12 March 2025
 * Desc : Implementation of BangunDatar class
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna, border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        this.jmlSisi = 0;
        this.warna = "";
        this.border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getBorder() {
        return this.border;
    }

    public static int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + getJmlSisi());
        System.out.println("Warna : " + getWarna());
        System.out.println("Border : " + getBorder());
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar : " + getCounterBangunDatar());
    }

}