/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 22-02-2025 
 */

public class Titik {
    /************** ATRIBUT *********************/ 
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /************** METHOD *********************/
    // Konstruktor untuk membuat titik(0, 0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading
    // Konntruktor untuk membuat dengan nilaai absis dan ordinat tertentu
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

    // Mencetak Titik
    public void printTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejaauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Menentukan dimana kuadran dari sebuah Titik
    public int getKuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        } else {
            return 4;
        }
    }

    // Menghitung jarak Titik dari pusat
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // Menghitung jarak antara Titik T1 dan T2
    public double getJarak(Titik T2){
        return Math.sqrt(Math.pow(this.absis - T2.absis, 2) + Math.pow(this.ordinat - T2.ordinat, 2));
    }

    // Merefleksikan suatu Titik terhadap sumbu x
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    // Merefleksikan suatu Titik terhadap sumbu y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    // Menghasilkan Titik baru yang merupakan hasil refleksi sumbu x dari objek Titik
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    // Menghasilkan Titik baru yang merupakan hasil refleksi sumbu y dari objek Titik
    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}
