/*
 * File : Dosen.java
 * Name : Novia Putri Yustiana
 * Date : 17 March 2025
 * Desc : Implementation of Dosen class
 */

import java.time.LocalDate;

class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() { return fakultas; }
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }
}