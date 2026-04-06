/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cript
 */
public class CanchaDTO {
    private int id;
    private String nombre;
    private boolean disponible;

    public CanchaDTO(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() { return nombre; }
    public boolean isDisponible() { return disponible; }
    
    @Override
    public String toString() {
        return nombre + (disponible ? " (Disponible)" : " (Ocupada)");
    }
}