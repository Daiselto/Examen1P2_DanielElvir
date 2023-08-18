/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1P2_DanielElvir;

/**
 *
 * @author HP
 */
public class Estadio {
    private String Nombre;
    private String Ciudad;
    private int Capacidad;
    private Equipo Equipo;

    public Estadio() {
    }

    public Estadio(String Nombre, String Ciudad, int Capacidad, Equipo Equipo) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Capacidad = Capacidad;
        this.Equipo = Equipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    @Override
    public String toString() {
        return "Nombre del Estadio: " + Nombre;
    }
    
    
}
