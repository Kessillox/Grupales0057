package rocketteam.java.grupal16;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {

    private int identificador;
    private int rutClinte;
    private LocalDate dia;

    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rutClinte, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutClinte = rutClinte;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getRutClinte() {
        return rutClinte;
    }

    public void setRutClinte(int rutClinte) {
        this.rutClinte = rutClinte;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String mostrarDetalle() {
        return "La capacitación será en " + getLugar() + " a las " + getHora() + " del día " + getDia() + " y durará " + getDuracion() + " minutos";
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut=" + rutClinte +
                ", dia=" + dia +
                ", hora=" + hora +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                '}';
    }
}
