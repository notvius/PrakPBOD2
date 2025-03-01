/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

 public class Kendaraan {
    /************** ATRIBUT *********************/ 
    private String noPlat;
    private String jenis;

    /************** METHOD *********************/
    // Konstruktor untuk membuat objek Kendaraan
    public Kendaraan(){
        this.noPlat = "#";
        this.jenis = "#";
    }

    // Overloading
    // Konstruktor untuk membuat objek Kendaraan dengan paramater tertentu
    public Kendaraan(String noPlat, String jenis){
        if (!jenis.equals("Motor") && !jenis.equals("Mobil")) {
            throw new IllegalArgumentException("Jenis kendaraan hanya boleh 'Motor' atau 'Mobil'");
        }
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Mengembalikan noPlat Kendaraan
    public String getNoPlat() {
        return noPlat;
    }

    // Mengembalikan jenis Kendaraan
    public String getJenis() {
        return jenis;
    }

    // Mengeset noPlat Kendaraan dengan string baru noPlat
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    // Mengeset jenis Kendaraan dengan string baru jenis
    public void setJenis(String jenis){
        if (!jenis.equals("Motor") && !jenis.equals("Mobil")) {
            throw new IllegalArgumentException("Jenis kendaraan hanya boleh 'Motor' atau 'Mobil'");
        }
        this.jenis = jenis;
    }
}
