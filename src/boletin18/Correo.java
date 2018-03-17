/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

/**
 *
 * @author Damian
 */
public class Correo {
    
    private boolean estado;
    private String contido;

    public Correo() {
}

    public Correo(String contido) {
        this.estado = false; 
        this.contido = contido;
    }

    @Override
    public String toString() {
        return "Correo{" + "estado=" + estado + ", contido=" + contido + '}';
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }
}
