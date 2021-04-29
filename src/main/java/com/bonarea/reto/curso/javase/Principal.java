/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.reto.curso.javase;


/**
 *
 * @author TraianDida
 */
public class Principal {
    public static void main(String[] args) {
       
        String msg = "Cómo será dar con Nekgikis V...";
        int [] numbers =  new int[]{23,24,25,18,19,5,6,7,20,15,17,8,10,11,4,3,12,2,16,14,9,21,0,1,13,22};
                
        Descifrador descifrador = new Descifrador(msg, numbers);                                
        System.out.println(descifrador.descifrarMsg());
                                                                      
    }
}
