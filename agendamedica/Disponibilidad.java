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

class Disponibilidad {
    private LocalDate fecha;
    private LocalTime horarioInicio;
    private LocalTime horarioFin;

    public Disponibilidad(LocalDate fecha, LocalTime horarioInicio, LocalTime horarioFin) {
        this.fecha = fecha;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public LocalTime getHorarioFin() {
        return horarioFin;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setHorarioFin(LocalTime horarioFin) {
        this.horarioFin = horarioFin;
    }

    @Override
    public String toString() {
        return "Disponibilidad{ " +
                "fecha=" + fecha +
                ", horarioInicio=" + horarioInicio +
                ", horarioFin=" + horarioFin +
                " }";
    }
}

