/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestion.de.citas;

import java.util.List;

class cita {
    private int idCita;
    private String fecha;
    private String hora;
    private String estado;

    public cita(int idCita, String fecha, String hora, String estado) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Cita ID " + idCita + " cambió a estado: " + estado);
    }

    public void enviarRecordatorio() {
        System.out.println("Recordatorio enviado para la cita ID: " + idCita);
    }

    public String getInfo() {
        return "ID: " + idCita + " | Fecha: " + fecha + " | Hora: " + hora + " | Estado: " + estado;
    }
}

class medico {
    public void verAgenda(List<cita> listaCitas) {
        System.out.println("Agenda del médico");
        for (cita c : listaCitas) {
            System.out.println(c.getInfo());
        }
    }

    public void confirmarCita(cita c) {
        c.cambiarEstado("confirmada");
    }

    public void rechazarCita(cita c) {
        c.cambiarEstado("rechazada");
    }
}

class administrador {
    public void verTodasLasCitas(List<cita> listaCitas) {
        System.out.println(" Todas las citas ");
        for (cita c : listaCitas) {
            System.out.println(c.getInfo());
        }
    }

    public void reasignarCita(cita c, String nuevaFecha, String nuevaHora) {
        c.cambiarEstado("reprogramada");
        System.out.println("Cita ID " + c.getInfo() + " reasignada a " + nuevaFecha + " " + nuevaHora);
    }

    public void generarReporte() {
        System.out.println("Reporte generado por el administrador.");
    }
}

public class GestionDeCitas {
    public static void main(String[] args) {
        System.out.println(" Sistema de Gestión de Citas Iniciado ");
        
    }
}
