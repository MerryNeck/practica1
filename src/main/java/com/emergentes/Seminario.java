
package com.emergentes;

public class Seminario {
    private String fecha;
    private String nombre;
    private String apellido;
    private String turno;
    private String[] seminario;
    
    public Seminario(){
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String[] getSeminario() {
        return seminario;
    }

    public void setSeminario(String[] seminario) {
        this.seminario = seminario;
    }
    
}
