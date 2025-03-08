/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 * Nama/NIM  : Novia Putri Yustiana 24060123140154
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            // Method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

// 1. Apakah baris 12 pada AngkaSial.java dieksekusi?
//    Jawab: 
//    Tidak, baris ini tidak akan dieksekusi jika angka yang dimasukkan adalah 13, karena sebelum sampai ke baris ini, program sudah melempar exception pada baris 10
//    Ketika exception dilempar, eksekusi langsung berpindah ke blok catch di main(), sehingga perintah setelah throw dalam metode cobaAngka() tidak akan dijalankan.
//    Kesimpulan:
//    - Jika angka ≠ 13 → Baris 12 dieksekusi.
//    - Jika angka = 13 → Baris 12 tidak dieksekusi karena terjadi exception.
// 2. Apakah baris 21 pada AngkaSial.java dieksekusi?
//    Jawab:
//    Ya, baris 21 (System.out.println(ase.getMessage());) akan dieksekusi jika terjadi eksepsi AngkaSialException. Karena pemanggilan as.cobaAngka(13); 
//    di dalam blok try akan memicu eksepsi, aliran program akan langsung lompat ke blok catch, sehingga baris 21 akan dieksekusi untuk mencetak pesan 
//    kesalahan dari eksepsi.
