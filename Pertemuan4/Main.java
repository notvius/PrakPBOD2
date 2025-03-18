/*
 * File : Main.java
 * Name : Novia Putri Yustiana
 * Date : 17 March 2025
 * Desc : Implementation Main driver for Pegawai, Dosen, DosenTetap, DosenTamu, and Tendik classes.
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------Detail Pegawai---------\n");
        DosenTetap dt = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000, "Fakultas Sains dan Matematika", "78647324");
        dt.printInfo();
        
        System.out.println("\n--------------------\n");
        
        DosenTamu dtm = new DosenTamu("9545647550", "Budi", LocalDate.of(1985, 8, 15), LocalDate.of(2020, 2, 1), 4000000, "Fakultas Teknik", "12345678", LocalDate.of(2026, 5, 1));
        dtm.printInfo();
        
        System.out.println("\n--------------------\n");
        
        Tendik td = new Tendik("1234567890", "Citra", LocalDate.of(1980, 3, 10), LocalDate.of(2005, 7, 1), 3500000, "Kemahasiswaan");
        td.printInfo();
    }
}

