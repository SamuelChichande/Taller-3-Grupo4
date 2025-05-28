package com.espol.Interface_segregation_principle;

public class Humano implements trabajador, Comedor{
    public void comer(){
        System.out.println("Está comiendo...");
    }
    public void trabajar(){
        System.out.println("Está trabajando...");
    }
    
}
