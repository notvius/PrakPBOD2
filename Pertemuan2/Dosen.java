/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 28-02-2025 
 */

public class Dosen {
    /************** ATRIBUT *********************/ 
    private String nip;
    private String nama;
    private String prodi;

    /************** METHOD *********************/
    // Konstruktor untuk membuat objek Dosen
    public Dosen(){
        this.nip = "#";
        this.nama = "#";
        this.prodi = "#";
    }

    // Overloading
    // Konstruktor untuk membuat objek dosen dengan paramater tertentu
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Mengembalikan Nip Dosen
    public String getNip() {
        return nip;
    }

    // Mengembalikan nama Dosen
    public String getNama() {
        return nama;
    }

    // Mengembalikan prodi Dosen
    public String getProdi() {
        return prodi;
    }

    // Mengeset nip Dosen dengan string baru nip
    public void setNip(String nip){
        this.nip = nip;
    }

    // Mengeset nama Dosen dengan string baru nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mengeset prodi Dosen dengan string baru prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}
