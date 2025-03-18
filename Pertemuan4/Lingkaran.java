/*
 * File : Lingkaran.java
 * Name : Novia Putri Yustiana
 * Date : 12 March 2025
 * Desc : Implementation of Lingkaran class
 */

public class Lingkaran extends BangunDatar {

    private double jari;
    public Lingkaran() {
        setJmlSisi(0);
    }

    public Lingkaran(double diameter, String warna, String border){
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }
}