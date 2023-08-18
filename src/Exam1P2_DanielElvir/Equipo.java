/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1P2_DanielElvir;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
class Equipo {

    private String Nombre;
    private String Pais;
    private int Rating;
    private ArrayList<Jugador> Plantilla = new ArrayList();

    public Equipo() {

    }

    public Equipo(String Nombre, String Pais, int Rating) {
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Rating = Rating;
    }

    public Equipo(String Nombre, String Pais) {
        this.Nombre = Nombre;
        this.Pais = Pais;
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public ArrayList<Jugador> getPlantilla() {
        return Plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> Plantilla) {
        this.Plantilla = Plantilla;
    }

    @Override
    public String toString() {
        return "Nombre del Equipo: " + Nombre ;
    }
    
    

}
