package com.espol.Dependency_InversionPrinciple;

public class Notification implements Envio{
    
    @Override
    public void send(String message) {
        System.err.println("Su mensaje se a enviado");
    }
    //Implementamos una interfaz que tiene un metodo envia y notifica que se ha enviado el mensaje
    //Sim embargo no especificamos el la forma de enviar
    //Asi se puede notificar el medio por el cual se envio el mensaje, ya sea por email o por SMS
}
