package com.espol.OpenClosedPrinciple;

public class Main {

    public static void main(String[] args) {
        
        // Se aplicara descuentos de acuerdo al tipo 

        Cantidad cantidad1= new Cantidad(45);

        //calculando descuento 
        System.out.println("El descuento por la cantidad comprada es de: "+cantidad1.calcularDescuento());


        //Si se crean nuevos tipos de descuentos
        // solo tendran que implementar la interfaz Descuento 
        // y asi cada tipo de descuento tendra su respectivo calculo 
    }
}
