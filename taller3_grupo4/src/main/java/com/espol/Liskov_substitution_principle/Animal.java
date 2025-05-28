package com.espol.Liskov_substitution_principle;

import javax.management.openmbean.SimpleType;

public class Animal {
    public void mover(){
        System.out.println("El animal se encuentra caminando...");
    }
}
// En este ejemplo tenemos la clase padre que es la principal y tambien tenemos 2 clases hijas
//en la cual están haciendo extends hacia la clase padre, respetando el principio de liskov de no
//no romper el comportamiendo esperado 
