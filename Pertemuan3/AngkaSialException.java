/**
 * File      : AngkaSialException.java
 * Deskripsi : Ekspresi buatan sendiri, menolak masukan angka 13!
 * Nama/NIM  : Novia Putri Yustiana 24060123140154
 */

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
