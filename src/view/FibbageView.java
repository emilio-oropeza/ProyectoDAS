/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.FibbageController;
import java.util.Scanner;

/**
 *
 * @author A01200493
 */
public class FibbageView {    
    FibbageController juego;
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cuantos;
        System.out.println("Cuantas personas van a jugar!");
        cuantos = Integer.parseInt(scan.next());
        juego = new FibbageController(cuantos);
        for(int i=0; i<5; i++){
            
        }
    }
    
    
}
