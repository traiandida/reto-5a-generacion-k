/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bonarea.reto.curso.javase;

import java.text.Normalizer;

/**
 *
 * @author TraianDida
 */
public class Descifrador {
    
    private String msg;
    private int numbers[];
    
    public Descifrador(String msg, int [] numbers){
        this.msg = msg;
        this.numbers = numbers;
    }
    
    public String tractarMsg(String msg){
        msg = sacarEspacios(msg);
        msg = sacarCapitales(msg);
        msg = sacarTildes(msg);
        
        return msg;
        
    }    
    
    public String descifrarMsg() {
                       
        char [] cadenaMsg = tractarMsg(this.msg).toCharArray();        
        char [] msgDescifrat = new char[cadenaMsg.length];
        
        for(int i = 0 ; i < this.numbers.length ; i++){
            msgDescifrat[numbers[i]] = cadenaMsg[i];
        }       
                                
        return new String(msgDescifrat);
        
    }
        
    public String sacarEspacios(String msg){
        return msg.replaceAll("\\s", "");
    }
    
    public String sacarCapitales(String msg){
        return msg.toLowerCase();
    }
    
    public String sacarTildes(String msg){
        msg = Normalizer.normalize(msg, Normalizer.Form.NFD);
        msg = msg.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        
        return msg;
    }


    
    
    
}
