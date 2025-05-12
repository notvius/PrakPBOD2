/*
 * File : MAnabul.java
 * Deskripsi : main class untuk generic anabul
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> koleksiAnabul = new KoleksiAnabul<>();

        // Gabungan nama unik total 10
        Map<String, String> namaJenisMap = new LinkedHashMap<>();
        namaJenisMap.put("Tom", "Kucing");
        namaJenisMap.put("Leo", "Kucing");
        namaJenisMap.put("Luna", "Kucing");
        namaJenisMap.put("Choko", "Anjing");
        namaJenisMap.put("Rocky", "Anjing");
        namaJenisMap.put("Midzy", "Anjing");
        namaJenisMap.put("Tweety", "Burung");
        namaJenisMap.put("Sky", "Burung");
        namaJenisMap.put("Rei", "Burung");
        namaJenisMap.put("Helean", "Burung");

        // Acak nama-nama tersebut
        List<Map.Entry<String, String>> daftarNama = new ArrayList<>(namaJenisMap.entrySet());
        Collections.shuffle(daftarNama);

        // Tambahkan ke koleksi
        for (int i = 0; i < 10; i++) {
            String nama = daftarNama.get(i).getKey();
            String jenis = daftarNama.get(i).getValue();

            switch (jenis) {
                case "Kucing" -> koleksiAnabul.add(new Kucing(nama));
                case "Anjing" -> koleksiAnabul.add(new Anjing(nama));
                case "Burung" -> koleksiAnabul.add(new Burung(nama));
            }
        }

        // Tampilkan semua
        koleksiAnabul.showAll();
    }
}

