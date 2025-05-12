/*
 * File : KoleksiAnabul.java
 * Deskripsi : kelas konstruksi generic untuk Anabul
 */

import java.util.ArrayList;

public class KoleksiAnabul<T extends Anabul> {
    private ArrayList<T> wadah = new ArrayList<>();

    public void add(T elemen) {
        wadah.add(elemen);
    }

    public ArrayList<T> getIsi() {
        return wadah;
    }

    public int getSize() {
        return wadah.size();
    }

    public void showAll() {
        for (T elemen : wadah) {
            System.out.println("Nama      : " + elemen.getNama());
            System.out.print("Bergerak  : ");
            elemen.gerak();
            System.out.print("Bersuara  : ");
            elemen.bersuara();
            System.out.println();
        }
    }
}
