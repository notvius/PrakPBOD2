/*
 * File : Segitiga.java
 * Deskripsi : implementasi Segitiga sebagai BangunDatar
 */

public class Segitiga extends BangunDatar{
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public Segitiga(double a, double b, double c) {
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }
    
    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
    
    @Override
    public double hitungLuas() {
        double s = hitungKeliling() / 2;
        return Math.sqrt(s * (s - sisiA) * (s - sisiB) * (s - sisiC));
    }
}
