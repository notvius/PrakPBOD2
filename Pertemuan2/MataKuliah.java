/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class MataKuliah
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

 public class MataKuliah {
    /************** ATRIBUT *********************/ 
    private String idMatKul;
    private String nama;
    private int sks;

    /************** METHOD *********************/
    // Konstruktor untuk membuat objek MataKuliah
    public MataKuliah(){
        this.idMatKul = "#";
        this.nama = "#";
        this.sks = 0;
    }

    // Overloading
    // Konstruktor untuk membuat objek MataKuliah dengan paramater tertentu
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Mengembalikan idMatKul MataKuliah
    public String getIdMatKul() {
        return idMatKul;
    }

    // Mengembalikan nama MataKuliah
    public String getNama() {
        return nama;
    }

    // Mengembalikan sks MataKuliah
    public int getSks() {
        return sks;
    }

    // Mengeset idMatKul MataKuliah dengan string baru idMatKul
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    // Mengeset nama MataKuliah dengan string baru nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Mengeset sks MataKuliah dengan string baru sks
    public void setSks(int sks){
        this.sks = sks;
    }
}
