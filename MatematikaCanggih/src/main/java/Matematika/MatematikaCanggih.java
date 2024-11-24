/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

/**
 *
 * @author Lenovo
 */
public class MatematikaCanggih extends Matematika {
    int hasilJumlah,hasilPerkalian;
    
    void setPenjumlahan(int a, int b){
        hasilJumlah = a + b;
    }
    
    int getPenjumlahan (){
        return hasilJumlah;  
    }
    
    void setPerkalian(int a, int b){
        hasilPerkalian = a * b;
    }
    
    int getPerkalian(){
        return hasilPerkalian;
    }
}
