/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author USER
 */
public class rumus implements bangundatar {

    @Override
    public void persegi() {
        System.out.println("Luas persegi = sisi*sisi");
    }

    @Override
    public void persegipanjang() {
        System.out.println("Luas persegi panjang = panjang*lebar");
    }

    @Override
    public void segitiga() {
        System.out.println("Luas segtiga = 1/2*alas*tinggi");
    }

    @Override
    public void lingkaran() {
        System.out.println("Luas lingkaran = phi*r*r");
    }
    
    @Override
    public void bangundatar1(){
        System.out.println("=== Kelompok bangun datar & rumusnya ===");
    }
    
    
}
