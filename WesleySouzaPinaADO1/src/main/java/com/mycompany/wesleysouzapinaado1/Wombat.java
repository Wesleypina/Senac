/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wesleysouzapinaado1;

/**
 *
 * @author wesley.spina
 */
public class Wombat {

    private String nome;

    private String corDoPelo;

    private double peso;

 

    public Wombat() {

    }

    public Wombat(String nome, String corDoPelo, double peso) {
        this.nome = nome;
        this.corDoPelo = corDoPelo;
        this.peso = peso;
    }



    // Getters and Setters

    public String getNome() {

        return nome;

    }

 

    public void setNome(String wesley) {

        this.nome = wesley;

    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

 

  

 


    
    public void andar(){
        System.out.println("O wombat  " + nome + " está andando");
    }
    
    public void roer() {
        System.out.println("O wombat  " + nome + " está roendo");
    }
}