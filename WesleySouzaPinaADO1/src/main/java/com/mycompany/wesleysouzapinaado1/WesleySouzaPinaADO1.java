/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wesleysouzapinaado1;

/**
 *
 * @author wesley.spina
 */
public class WesleySouzaPinaADO1 {
 
    public static void main(String[] args) {
        Wombat wombat1 = new Wombat();
        
        wombat1.setNome("francisquin");
        wombat1.setCorDoPelo("marrom");
        wombat1.setPeso(10.4);
        
        
        System.out.println(wombat1.getNome());
        System.out.println(wombat1.getPeso());
        System.out.println(wombat1.getCorDoPelo());
        wombat1.andar();
        
        System.out.println("---------------------");
        
        Wombat wombat2 = new Wombat("zezinho", "branco", 20.4);
        
         System.out.println(wombat2.getNome());
        System.out.println(wombat2.getPeso());
        System.out.println(wombat2.getCorDoPelo());
        wombat2.roer();
        
    }
  

}

 


   

