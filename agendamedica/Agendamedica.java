/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendamedica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 57313
 */

public class Agendamedica {
    
public static void main(String[] args) {
    
}
    private final Medico_1 medico;
    private final List<Cita> citas;
    private final Disponibilidad disponibilidad;

    public Agendamedica(Medico_1 medico, Disponibilidad disponibilidad) {
        this.medico = medico;
        this.citas = new ArrayList<>();
        this.disponibilidad = disponibilidad;
    }

    public void consultarAgendaDiaria() {
        System.out.println("Agenda diaria del médico: " + medico.getNombre());

        citas.stream()
                .filter(c -> c.getFecha().equals(disponibilidad.getFecha()))
                .forEach(System.out::println);
    }

    public void consultarAgendaSemanal() {
        System.out.println("Agenda semanal del médico: " + medico.getNombre());

        LocalDate inicio = disponibilidad.getFecha();
        LocalDate fin = inicio.plusDays(6);

        citas.stream()
                .filter(c -> !c.getFecha().isBefore(inicio) && !c.getFecha().isAfter(fin))
                .forEach(System.out::println);
    }

    public void verDisponibilidad() {
        System.out.println("Disponibilidad del médico " + medico.getNombre());
        System.out.println("Fecha: " + disponibilidad.getFecha());
        System.out.println("Horario: " + disponibilidad.getHorarioInicio() +
                " a " + disponibilidad.getHorarioFin());
    }

    public void confirmarCita(Cita c) {
        c.setEstado("Confirmada");
        System.out.println("Cita confirmada para: " + c.getPaciente().getNombre());
    }

    public void rechazarCita(Cita c) {
        c.setEstado("Rechazada");
        System.out.println("Cita rechazada.");
    }

    public void marcarCitaAtendida(Cita c) {
        c.setEstado("Atendida");
        System.out.println("Cita marcada como atendida.");
    }

    public void agregarNota(Cita c, String nota) {
        c.setNota(nota);
        System.out.println("Nota agregada.");
    }


    public void agregarCita(Cita c) {
        if (!estaEnDisponibilidad(c)) {
            System.out.println("La cita no está dentro del horario disponible.");
            return;
        }

        citas.add(c);
        System.out.println("Cita agregada correctamente.");
    }

    private boolean estaEnDisponibilidad(Cita c) {
        return c.getFecha().equals(disponibilidad.getFecha()) &&
                !c.getHoraInicio().isBefore(disponibilidad.getHorarioInicio()) &&
                !c.getHoraFin().isAfter(disponibilidad.getHorarioFin());
    }

    public List<Cita> getCitas() {
        return citas;
    }
    
}