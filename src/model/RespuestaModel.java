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
public class RespuestaModel {
    
    private String respuesta;
    private int valor;
    private boolean correcta;

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the correcta
     */
    public boolean isCorrecta() {
        return correcta;
    }

    /**
     * @param correcta the correcta to set
     */
    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
    
    
}
