/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cancha;

import Controlador.ControladorHomeJugador;
import Controlador.ControladorHistorialJugador;
import Vistas.VistaHomeJugador;
import Vistas.VistaHistorialJugador;
import modelo.BackendService;

/**
 *
 * @author cript
 */
public class Cancha {
    public static void main(String[] args) {

        // 1. Backend compartido
        BackendService backend = new BackendService();

        // 2. Vista y controlador Home 
        VistaHomeJugador vistaHome = new VistaHomeJugador();
        ControladorHomeJugador controladorHome = new ControladorHomeJugador(vistaHome, backend);
        controladorHome.iniciar();

        // 3. Vista y controlador Historial (lo mio)
        VistaHistorialJugador vistaHistorial = new VistaHistorialJugador();
        ControladorHistorialJugador controladorHistorial = new ControladorHistorialJugador(vistaHistorial, backend);
        controladorHistorial.iniciar();
    }
}
