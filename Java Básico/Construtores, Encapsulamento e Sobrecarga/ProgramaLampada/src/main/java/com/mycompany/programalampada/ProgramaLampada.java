/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programalampada;

/**
 *
 * @author Marina
 */
public class ProgramaLampada {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligarLampada();
        lampada.mostrarEstado();
        lampada.desligarLampada();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
