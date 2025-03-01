/* Nama File : MMataKuliah.java
 * Deskripsi : berisi main driver dari atribut dan method dalam class MataKuliah
 * Pembuat : Novia Putri Yustiana 24060123140154
 * Tanggal : 01-03-2025 
 */

 public class MMataKuliah {
    public static void main(String[] args) {
        // Membuat objek mata kuliah dengan konstruktor default
        MataKuliah m1 = new MataKuliah();
        
        // Membuat objek mata kuliah dengan konstruktor berparameter
        MataKuliah m2 = new MataKuliah("PAIK120", "Algoritma Pemrograman", 3);
        
        // Menampilkan data mata kuliah m2 yang sudah diinisialisasi melalui konstruktor
        System.out.println("Mata Kuliah m2:");
        System.out.println("ID Mata Kuliah = " + m2.getIdMatKul());
        System.out.println("Nama Mata Kuliah = " + m2.getNama());
        System.out.println("Sks Mata Kuliah = " + m2.getSks());

        // Mengubah data mata kuliah m1 menggunakan setter
        m1.setIdMatKul("PAIK046");
        m1.setNama("Matematika I");
        m1.setSks(2);
        
        // Menampilkan data mata kuliah m1 setelah diubah melalui setter
        System.out.println("\nMata Kuliah m1:");
        System.out.println("ID Mata Kuliah = " + m1.getIdMatKul());
        System.out.println("Nama Mata Kuliah = " + m1.getNama());
        System.out.println("Sks Mata Kuliah = " + m1.getSks());
    }
}

