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
public class FibbageModel {
    
    private RespuestaModel[] respuestas;
    private JugadorModel[] jugadores;
    private String[] preguntas;
    
    public FibbageModel(int numJugadores){
        this.respuestas = new RespuestaModel[numJugadores+1];
        this.jugadores = new JugadorModel[numJugadores];
        this.preguntas = new String[5];
    }   

    /**
     * @return the respuestas
     */
    public RespuestaModel[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(RespuestaModel[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * @return the jugadores
     */
    public JugadorModel[] getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(JugadorModel[] jugadores) {
        this.jugadores = jugadores;
    }

    /**
     * @return the preguntas
     */
    public String[] getPreguntas() {
        return preguntas;
    }

    /**
     * @param preguntas the preguntas to set
     */
    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }
    
    
}