/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedica;


import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // Crear médico
        Medico_1 medico = new Medico_1("Dr. Juan", "Cardiología");

        // Crear disponibilidad
        Disponibilidad disp = new Disponibilidad(
                LocalDate.of(2025, 11, 29),
                LocalTime.of(10, 0),
                LocalTime.of(11, 0)
        );

        // Crear agenda médica
        AgendaMedica agenda = new AgendaMedica(medico, disp);

        // Crear paciente y cita
        Paciente paciente = new Paciente("Ana", "12345", "ana@mail.com");
        Cita cita = new Cita(paciente, medico, disp);

        // Agregar cita
        agenda.agregarCita(cita);

        // Mostrar agenda y citas
        System.out.println("\n--- Disponibilidad del médico ---");
        agenda.verDisponibilidad();

        System.out.println("\n--- Agenda diaria ---");
        agenda.consultarAgendaDiaria();
    }
}

