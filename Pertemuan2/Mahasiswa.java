/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

import java.util.ArrayList;

public class Mahasiswa {
    /************** ATRIBUT *********************/ 
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /************** METHOD *********************/
    // Konstruktor untuk membuat objek Mahasiswa
    public Mahasiswa(){
        this.nim = "#";
        this.nama = "#";
        this.prodi = "#";
        this.listMatKul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = null;
    }

    // Overloading
    // Konstruktor untuk membuat objek Mahasiswa dengan paramater tertentu
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = (listMatKul != null) ? listMatKul : new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Mengembalikan nim Mahasiswa
    public String getNim() {
        return nim;
    }

    // Mengembalikan nama Mahasiswa
    public String getNama() {
        return nama;
    }

    // Mengembalikan prodi Mahasiswa
    public String getProdi() {
        return prodi;
    }

    // Mengembalikan daftar mata kuliah yang diambil mahasiswa
    public ArrayList<MataKuliah> getListMatKul(){
        return listMatKul;
    }

    // Mengembalikan dosen wali mahasiswa
    public Dosen getDosenWali(){
        return dosenWali;
    }

    // Mengembalikan kendaraan yang dimiliki mahasiswa
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    // Mengatur NIM mahasiswa
    public void setNim(String nim){
        this.nim = nim;
    }

    // Mengatur Nama mahasiswa
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mengatur Program Studi mahasiswa
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // Mengatur daftar mata kuliah mahasiswa
    public void setListMatkul(ArrayList<MataKuliah> listMatKul){
        this.listMatKul = (listMatKul != null) ? listMatKul : new ArrayList<>();
    }

    // Mengatur dosen wali mahasiswa
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // Mengatur kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Menambahkan mata kuliah ke dalam daftar mata kuliah mahasiswa
    public void addMatKul (MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    // Menghitung total SKS dari mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int sum = 0;
        for (MataKuliah mk : listMatKul){
            sum += mk.getSks();
        }
        return sum;
    }

    // Menghitung jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return listMatKul.size();
    }

    // Menampilkan informasi dasar mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Menampilkan detail lengkap mahasiswa termasuk daftar mata kuliah, dosen wali, dan kendaraan
    public void printDetailMhs(){
        printMhs();
        
        System.out.println("\nDaftar Mata Kuliah: ");
        if (listMatKul.isEmpty()){
            System.out.println("Belum mengambil mata kuliah.");
        } else {
            for (MataKuliah mk : listMatKul){
                System.out.println(" - " + mk.getNama() + " (" + mk.getSks() + " SKS)");
            }
        }

        System.out.println("\nDosen Wali:");
        System.out.println("Nama: " + dosenWali.getNama());
        System.out.println("NIP: " + dosenWali.getNip());
        System.out.println("Prodi: " + dosenWali.getProdi());

        System.out.println("\nKendaraan: ");
        if (kendaraan != null) {
            System.out.println("Jenis: " + kendaraan.getJenis());
            System.out.println("No Plat: " + kendaraan.getNoPlat());
        } else {
            System.out.println("Mahasiswa tidak memiliki kendaraan.");
        }
    }
}
