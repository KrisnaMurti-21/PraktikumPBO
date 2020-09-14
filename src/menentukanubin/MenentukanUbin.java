/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menentukanubin;

/**
 *
 * @author Lenovo
 */
public class MenentukanUbin {

    /**
     * @param args the command line arguments
     */
    
    double panjang;
    double lebar;
    double ubin;
    double luasTanah = 1000000;
    double kebutuhan;
    double box;
    double hargaJenis;
    
    double luasKeramik(){
        double luasKeramik;
        luasKeramik = this.panjang * this.lebar;
        return luasKeramik;
    }
    
    double ubinDibutuhkan(){
        double ubinDibutuhkan;
        ubinDibutuhkan = this.luasTanah / this.ubin;
        return ubinDibutuhkan;
    }
    
    double harga(){
        double hargaBox;
        hargaBox = Math.ceil(this.kebutuhan / this.box) * hargaJenis;
        return hargaBox;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MenentukanUbin k1 = new MenentukanUbin();
        k1.panjang = 30;
        k1.lebar = 30;
        k1.ubin = k1.luasKeramik();
        k1.kebutuhan = Math.ceil(k1.ubinDibutuhkan());
        k1.box = 10;
        k1.hargaJenis = 54000;
        System.out.println("Ubin yang dibutuhkan sebanyak:" + Math.ceil(k1.ubinDibutuhkan()));
        System.out.println("Harga untuk ubin A adalah:" + k1.harga());
        
        
        MenentukanUbin k2 = new MenentukanUbin();
        k2.panjang = 40;
        k2.lebar = 40;
        k2.ubin = k2.luasKeramik();
        k2.kebutuhan = Math.ceil(k2.ubinDibutuhkan());
        k2.box = 5;
        k2.hargaJenis = 65000;
        System.out.println("Ubin yang dibutuhkan sebanyak:" + Math.ceil(k2.ubinDibutuhkan()));
        System.out.println("Harga untuk ubin B adalah:" + k2.harga());
        
        MenentukanUbin k3 = new MenentukanUbin();
        k3.panjang = 30;
        k3.lebar = 40;
        k3.ubin = k3.luasKeramik();
        k3.kebutuhan = Math.ceil(k3.ubinDibutuhkan());
        k3.box = 8;
        k3.hargaJenis = 60000;
        System.out.println("Ubin yang dibutuhkan sebanyak:" + Math.ceil(k2.ubinDibutuhkan()));
        System.out.println("Harga untuk ubin C adalah:" + k3.harga());
    }
    
}
