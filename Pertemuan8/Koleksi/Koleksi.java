/*
 * File : Koleksi.java
 * Deskripsi : implementasi Koleksi 
 */

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        this.wadah = new ArrayList<>();
        this.nbelm = 0;
    }

    // Fungsi getIsi
    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        }
        return null;
    }

    // Prosedur setIsi
    public void setIsi(int index, T elemenBaru) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, elemenBaru);
        }
    }

    // Fungsi getSize
    public int getSize() {
        return nbelm;
    }

    // Prosedur setSize (mengubah banyaknya elemen efektif)
    public void setSize(int size) {
        if (size >= 0) {
            nbelm = size;
            // Tambah elemen null jika perlu
            while (wadah.size() < size) {
                wadah.add(null);
            }
        }
    }

    // Prosedur add
    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    // Metode delete
    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            wadah.remove(index);
            nbelm--;
        }
    }

    // Prosedur showAll
    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Elemen ke-" + (i+1) + ": " + wadah.get(i));
        }
    }
}
