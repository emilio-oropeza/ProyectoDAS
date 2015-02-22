/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.FibbageModel;
import model.JugadorModel;

/**
 *
 * @author A01200493
 */
public class FibbageController {
    FibbageModel sesion;
    JugadorModel[] toSet;
    
    public FibbageController(int numJugadores){
        sesion = new FibbageModel(numJugadores);
        toSet = new JugadorModel[numJugadores];
    }
    
    public void assignPlayers(String nombre){
        JugadorModel player;
        for(int i = 0; i<toSet.length; i++){
            player = new JugadorModel();
            player.setNombre(nombre);
            player.setPuntaje(0);
            toSet[i] = player;
        }
        sesion.setJugadores(toSet);
    }
    public void assignQuestions(){
        String[] question = new String[5];
        for(int i = 0; i<sesion.getPreguntas().length; i++){
            question[i] = "Pregunta " + i;
        }
        sesion.setPreguntas(question);
    }
    
    public void assignAnswers(String respuesta){
        String[] answers = new String[sesion.getPreguntas().length];
        for(int i = 0; i<sesion.getRespuestas().length; i++){
            answers[i] = respuesta;
        }
        sesion.setJugadores(toSet);
    }
    
    
}
