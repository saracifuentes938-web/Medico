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
class Cita {
    
    private final LocalDate fecha;
    private final LocalTime horaInicio;
    private final LocalTime horaFin;
    private final Paciente paciente;
    private String estado;
    private String nota;

    public Cita(LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, Paciente paciente) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.paciente = paciente;
        this.estado = "Pendiente";
    }

    Cita(Paciente paciente1, Medico_1 medico, Disponibilidad disp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    
    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", horaInicio=" + horaInicio +
                ", horaFin=" + horaFin +
                ", paciente=" + paciente.getNombre() +
                ", estado='" + estado + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }

}

