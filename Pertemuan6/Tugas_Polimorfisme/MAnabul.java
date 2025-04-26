// Nama file: MAnabul.java
// Pembuat: Novia Putri Yustiana
// NIM: 24060123140154
// Lab: D2
// Tanggal: 25-04-2025

import java.util.ArrayList;

public class MAnabul {
    public static void main(String[] args) {
        Anabul anabul1 = new Kucing("Markoneng");
        Anabul anabul2 = new Anjing("Chiko");
        Anabul anabul3 = new Burung("Helean");

        ArrayList<Anabul> ans = new ArrayList<>();
        ans.add(anabul1);
        ans.add(anabul2);
        ans.add(anabul3);

        for (Anabul an : ans) {
            System.out.println("Nama      : " + an.getNama());
            System.out.print("Bergerak  : ");
            an.gerak();
            System.out.print("Bersuara  : ");
            an.bersuara();
            System.out.println(); // spasi antar hewan
        }
    }
}