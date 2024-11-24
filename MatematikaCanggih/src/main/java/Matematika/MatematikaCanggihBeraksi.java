/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Lenovo
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();
        
        mc.setModulus(8,6);
        System.out.println("Hasil Modulus = "+mc.getModulus());
        mc.setPenjumlahan(8,6);
        System.out.println("Hasil Penjumlahan = "+mc.getPenjumlahan());
        mc.setPerkalian(9,8);
        System.out.println("Hasil Perkalian = "+mc.getPerkalian());
    }
}
