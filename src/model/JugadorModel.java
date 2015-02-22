/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author A01200493
 */
public class JugadorModel {
    
    private String nombre;
    private int puntaje;
    private RespuestaModel[] respuestas;
    
    public JugadorModel(){
        respuestas = new RespuestaModel[5];
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the puntaje
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * @param puntaje the puntaje to set
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * @return the respuetas
     */
    public RespuestaModel[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuetas to set
     */
    public void setRespuestas(RespuestaModel[] respuestas) {
        this.respuestas = respuestas;
    }
    
    
    
    
}
