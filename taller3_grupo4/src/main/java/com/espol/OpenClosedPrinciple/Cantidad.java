package com.espol.OpenClosedPrinciple;

public class Cantidad  implements Descuento{

    private int cantidad;

    public Cantidad(int cantidad){
        this.cantidad= cantidad;

    }

    public double calcularDescuento(){
        return cantidad*0.50;
    }

}
