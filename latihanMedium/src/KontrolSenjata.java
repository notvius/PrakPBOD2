/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lalic
 */
public class KontrolSenjata {
    // Atribut
    private Senjata senjata;
    
    // Methods
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        int peluruBaru = senjata.getPeluru() + jumPeluru;
        senjata.setPeluru(peluruBaru);
        System.out.println(">> Peluru berhasil ditambah: "+ jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        
        boolean adaTembakan = false;
        boolean gagalTembak = false;

        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return; 
        }

        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
                adaTembakan = true;
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                gagalTembak = true;
            }
        }

        if (gagalTembak || adaTembakan) {
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }

    
    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Jleb!");
        } else {
            System.out.println("Bayonet tidak terpasang");
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet sudah terpaasang");
    }
}
