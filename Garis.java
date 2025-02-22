/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 22-02-2025 
 */

public class Garis {
    /************** ATRIBUT *********************/ 
    Titik titikAwal;
    Titik titikAkhir;
    static int counterGaris = 0;

    /************** METHOD *********************/
    // Konstruktor untuk membuat Garis(0, 0)
    public Garis(){
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Overloading
    // Konntruktor untuk membuat dengan nilai titik tertentu
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    // Mengembalikan titikAwal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titikAkhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengeset titikAwal dengan titik baru titikAwal
    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    // Mengeset titikAkhir dengan titik baru titikAkhir
    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    // Mencetak Garis
    public void printGaris(){
        System.out.println("Garis dari (" + titikAwal + " ke " + titikAkhir + ")");
    }

    // Menghitung panjang objek garis
    public double getPanjang(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx +dy * dy);
    }

    // Mendapatkan gradien dari sebuah garis
    public double getGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (dx == 0) {
            System.out.println("Garis vertikal, gradien tidak terdefinisi");
        }
        return dy / dx;
    }

    // Mendapatkan titik tengah dari sebuah garis
    public Titik getTitikTengah(){
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Mengecek apakah objek garis sejajar dengan sebuah garis lainnya
    public boolean isSejajar(Garis g1){
        return this.getGradien() == g1.getGradien();
    }

    // Mengecek apakah objek garis tegak lurus dengan sebuah garis lainnya
    public boolean isTegakLurus(Garis g1){
        return this.getGradien() * g1.getGradien() == -1;
    }

    // Menampilkan persamaan garis dalam bentuk string y = mx + c
    public String getPersamaanGaris(){
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x  + " + c;
    }
}

    