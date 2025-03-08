/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Nama/NIM  : Novia Putri Yustiana 24060123140154
 */

// Class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// Class Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            + kelilingLingkaran);
    }
}


// Terdapat kekeliruan dalam konsep penerapan asersi (assertion) pada program Asersi2 di atas. Berikut beberapa aspek yang kurang tepat:
// 1.  Asersi Dijakankan Setelah Variabel Dialokasikan ke Objek
//     - Asersi (assert(jariJari > 0): "Jari-jari tidak boleh nol!!!";) berfungsi untuk menjamin bahwa nilai jariJari lebih dari nol.
//     - Namun, dalam kode tersebut, jariJari telah ditetapkan dengan nilai 0, sehingga asersi akan gagal.
//     - Seharusnya, nilai jariJari perlu diverifikasi sebelum digunakan dalam proses pembuatan objek Lingkaran.
// 2.  Sebaiknya Lakukan Validasi di Konstruktor
//     Alih-alih mengandalkan asersi, lebih baik menerapkan validasi di dalam konstruktor Lingkaran untuk memastikan bahwa jariJari memiliki nilai yang sesuai.


