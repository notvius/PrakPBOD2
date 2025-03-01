/* Nama File : MMahasiswa.java
 * Deskripsi : berisi main driver untuk atribut dan method dalam class Mahasiswa
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

 public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah dengan parameter (ID, Nama, SKS)
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("SC", "Sistem Cerdas", 3);
        
        // Membuat objek Mahasiswa dengan parameter (NIM, Nama, Prodi)
        Mahasiswa M1 = new Mahasiswa("123", "Heny", "Informatika");
        
        // Membuat objek Dosen dengan parameter (NIP, Nama, Prodi)
        Dosen D1 = new Dosen("112", "Shinta", "Informatika");
        
        // Membuat objek Kendaraan dengan parameter (No Plat, Jenis Kendaraan)
        Kendaraan K1 = new Kendaraan("B8392BG", "Motor");
        
        // Mengatur dosen wali untuk mahasiswa
        M1.setDosenWali(D1);
        
        // Mengatur kendaraan yang dimiliki mahasiswa
        M1.setKendaraan(K1);
        
        // Menambahkan mata kuliah ke daftar mata kuliah mahasiswa
        M1.addMatKul(MBD);
        M1.addMatKul(PBO);
        
        // Menampilkan detail lengkap mahasiswa
        M1.printDetailMhs();
        
        // Menampilkan jumlah mata kuliah yang diambil mahasiswa
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        
        // Menampilkan total SKS yang diambil mahasiswa
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}

