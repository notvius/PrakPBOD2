/*
 * File : Persegi.java
 * Name : Novia Putri Yustiana
 * Date : 12 March 2025
 * Desc : Implementation of persegi class
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }  

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return sisi * 4;
    }

    public double getDiagonal() {
        return Math.sqrt((sisi * sisi) + (sisi * sisi)); 
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
    }

    public static void printCounterBangunDatar() {
        BangunDatar.printCounterBangunDatar();
    }

}