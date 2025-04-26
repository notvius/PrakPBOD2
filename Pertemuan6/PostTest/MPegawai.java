// Nama file: MPegawai.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

import java.util.ArrayList;

public class MPegawai {
    public static void main(String[] args) {

        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// Jawab Pertanyaan 

// 2.	Jelaskan manfaat polimorfisme pada kasus ini.
// Jawab:
// Polimorfisme merupakan kemampuan suatu referensi objek untuk merujuk ke berbagai bentuk objek dari subclass-nya. 
// Dalam kasus ini, class Pegawai digunakan sebagai class induk, dan Programmer serta Manajer merupakan subclass yang mewarisi dari Pegawai.
// Manfaat utama dari penggunaan polimorfisme dalam kasus ini adalah:
//  1.	Menyederhanakan kode program: Objek Programmer dan Manajer dapat disimpan dalam referensi bertipe Pegawai, sehingga tidak perlu 
//      membuat variabel berbeda untuk setiap jenis pegawai.
//  2.	Mempermudah pemrosesan objek secara umum: Semua jenis pegawai dapat disimpan dalam satu array atau list bertipe Pegawai, lalu 
//      memanggil method tampilData() dalam satu perulangan tanpa perlu memikirkan jenis objek secara eksplisit.
//  3.	Memudahkan pengembangan ke depan: Jika perlu menambahkan jenis pegawai baru, cukup membuat subclass baru dan override method 
//      tampilData(), tanpa harus mengubah kode di bagian program utama.
// Dengan polimorfisme, program menjadi lebih fleksibel, mudah dipelihara, dan lebih terstruktur sesuai prinsip Pemrograman Berorientasi Objek (OOP).

// 3.	Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme(inclusion)?
// Jawab: 
// Apabila pada main program perlu menambahkan pegawai4 dan pegawai5 tanpa menggunakan polimorfisme (inclusion), beberapa permasalahan yang akan muncul antara lain:
//  1.	Sulit mengelola banyak objek: Setiap jenis pegawai (misalnya Programmer, Manajer, dll.) harus ditangani secara terpisah, sehingga kode menjadi 
//      tidak efisien, terutama ketika jumlah objek bertambah banyak.
//  2.	Tidak dapat menyimpan semua objek dalam satu array bertipe umum: Tanpa polimorfisme, tidak bisa membuat array Pegawai[] yang berisi berbagai 
//      jenis pegawai. Sebaliknya, harus membuat array terpisah untuk setiap tipe (Programmer[], Manajer[], dll).
//  3.	Pemanggilan method harus dilakukan satu per satu: Tanpa kemampuan override dinamis dari polimorfisme, setiap objek harus dipanggil secara 
//      eksplisit, sehingga tidak dapat menggunakan perulangan umum untuk menampilkan data pegawai.
//  4.	Kode menjadi lebih kompleks dan sulit dikembangkan: Jika ada perubahan atau penambahan jenis pegawai, maka bagian main program juga harus 
//      ikut diubah secara manual.
// Dengan demikian, tanpa polimorfisme, program menjadi kurang fleksibel, lebih panjang, dan lebih sulit dikembangkan di masa depan.




