/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cancha;

import Controlador.ControladorHomeJugador;
import Vistas.VistaHomeJugador;
import modelo.BackendService;

/**
 *
 * @author cript
 */
public class Cancha {

  public static void main(String[] args) {
        // 1. Instanciar el backend (Tu .jar)
        BackendService backend = new BackendService();
        
        // 2. Instanciar la vista
        VistaHomeJugador vista = new VistaHomeJugador();
        
        // 3. Instanciar el controlador y "cablear" vista con modelo
        ControladorHomeJugador controlador = new ControladorHomeJugador(vista, backend);
        
        // 4. Arrancar la aplicación
        controlador.iniciar();
    }
}
