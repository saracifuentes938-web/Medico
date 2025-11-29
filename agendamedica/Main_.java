/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendamedica;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author 57313
 */
public class Main_ {
  public static void main(String[] args) {
       
        Medico_1 medico = new Medico_1("Juan", "Cardiología");
        Disponibilidad disponible = new Disponibilidad(
                LocalDate.of(2025, 11, 29),
                LocalTime.of(10, 0),
                LocalTime.of(11, 0)
        );

       
        Agendamedica agenda;
        agenda = new Agendamedica(medico, disponible);

      
        Paciente paciente1 = new Paciente("Ana", "12345", "ana@mail.com");
        Paciente paciente2 = new Paciente("Luis", "67890", "luis@mail.com");

     
        Cita cita1;
      cita1 = new Cita(paciente1, medico, disponible);
        Cita cita2 = new Cita(paciente2, medico, disponible);

      
        agenda.agregarCita(cita1); 
        agenda.agregarCita(cita2);

        // 7️⃣ Mostrar información
        System.out.println("\n--- Disponibilidad del médico ---");
        agenda.verDisponibilidad();

        System.out.println("\n--- Agenda diaria ---");
        agenda.consultarAgendaDiaria();

        System.out.println("\n--- Confirmar y agregar notas a la primera cita ---");
        agenda.confirmarCita(cita1);
        agenda.agregarNota(cita1, "Paciente con síntomas leves de resfriado.");

        System.out.println("\n--- Agenda diaria después de confirmar y agregar nota ---");
        agenda.consultarAgendaDiaria();
    }

    private Main_() {
    }
}   

