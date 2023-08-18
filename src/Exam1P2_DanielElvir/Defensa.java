/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1P2_DanielElvir;

/**
 *
 * @author HP
 */
public class Defensa extends Jugador{

    public Defensa() {
        super();
    }

    public Defensa(String Nombre, int Edad, String Nacionalidad, String Pie_Habil) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil);
    }

    public Defensa(String Nombre, int Edad, String Nacionalidad, String Pie_Habil, int Rating, Exam1P2_DanielElvir.Equipo Equipo, int Agarre, int Lanzamiento, int Fisica, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil, Rating, Equipo, Agarre, Lanzamiento, Fisica, Ritmo, Entrada, Vision, Passing, Regate, Disparo);
    }

    
    
    @Override
    public void calculoRating() {
        
    }
    
    @Override
    public String toString() {
        return "Nombre del Defensa: " + super.toString();
    }
    
}
