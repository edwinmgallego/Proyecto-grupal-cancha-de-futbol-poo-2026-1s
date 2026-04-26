/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cript
 */
import java.util.ArrayList;
import java.util.List;

public class BackendService {

    // Los estudiantes asumen que este código ya existe en el .jar y solo lo consumen
    public List<CanchaDTO> obtenerCanchasDisponibles() {
        // Simulación de respuesta de base de datos
        List<CanchaDTO> canchas = new ArrayList<>();
        canchas.add(new CanchaDTO(1, "Cancha Norte - Sintética", true));
        canchas.add(new CanchaDTO(2, "Cancha Sur - Grama", true));
        return canchas;
    }

    public boolean procesarReserva(String nombreCancha) {
        System.out.println("LOG BACKEND: Procesando reserva en " + nombreCancha);
        return true; // Simula una reserva exitosa
    }

    public List<String[]> obtenerHistorialJugador(String nombreJugador) {
        List<String[]> historial = new ArrayList<>();
        historial.add(new String[]{"Cancha Norte - Sintética", "2026-04-10", "08:00", "1 hora", "Confirmada"});
        historial.add(new String[]{"Cancha Sur - Grama", "2026-04-15", "10:00", "2 horas", "Confirmada"});
        historial.add(new String[]{"Cancha Norte - Sintética", "2026-04-20", "16:00", "1 hora", "Cancelada"});
        return historial;
    }
}
