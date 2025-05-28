package com.espol.PrincipioUnicaResponsabilidad;

public class Empleado { //Clase que representa solamente al empleado.
    private String nombre;
    private String puesto;

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPuesto() {
        return puesto;
    }

}
