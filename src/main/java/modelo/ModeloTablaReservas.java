/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author felip
 */


public class ModeloTablaReservas extends AbstractTableModel {

    private final String[] columnas = {
        "ID Reserva", "Cancha", "Jugador", "Fecha", "Hora", "Estado"
    };

    private List<Object[]> filas;

    // Constructor vacío
    public ModeloTablaReservas() {
        this.filas = new ArrayList<>();
    }

    // Constructor con datos - Sobrecarga (requisito POO)
    public ModeloTablaReservas(List<Object[]> datosIniciales) {
        this.filas = new ArrayList<>(datosIniciales);
    }

    @Override
    public int getRowCount() {
        return filas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        return filas.get(fila)[columna];
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    @Override
    public boolean isCellEditable(int fila, int columna) {
        return false;
    }

    // Agrega fila y refresca la tabla
    public void agregarFila(Object[] fila) {
        filas.add(fila);
        fireTableRowsInserted(filas.size() - 1, filas.size() - 1);
    }

    // Limpia toda la tabla
    public void limpiarTabla() {
        filas.clear();
        fireTableDataChanged();
    }

    // Devuelve una fila por índice
    public Object[] getFila(int indice) {
        return filas.get(indice);
    }

    // Elimina una fila por índice
    public void eliminarFila(int indice) {
        filas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
