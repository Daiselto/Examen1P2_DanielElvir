/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1P2_DanielElvir;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Defensa extends Jugador{

    public Defensa() {
        super();
    }

    public Defensa(String Nombre, int Edad, String Nacionalidad, String Pie_Habil, Exam1P2_DanielElvir.Equipo Equipo) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil, Equipo);
    }

    

    public Defensa(String Nombre, int Edad, String Nacionalidad, String Pie_Habil, int Rating, Exam1P2_DanielElvir.Equipo Equipo, int Agarre, int Lanzamiento, int Fisica, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil, Rating, Equipo, Agarre, Lanzamiento, Fisica, Ritmo, Entrada, Vision, Passing, Regate, Disparo);
    }

    
    @Override
    public String toString() {
        return "Nombre del Defensa: " + super.toString();
    }

    @Override
    public void calculoRatingEspecial(int Fisica, int Ritmo, int Entrada) {
         boolean valido = true;
        while (valido) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Fisica = base * 12;
            if (Fisica >= 70) {
                this.Fisica = Fisica;
                valido = false;
            } else {
                valido = true;
            }
        }

        boolean valido1 = true;
        while (valido1) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Ritmo = base * 12;
            if (Ritmo >= 70) {
                this.Ritmo = Ritmo;
                valido1 = false;
            } else {
                valido1 = true;
            }
        }

        boolean valido2 = true;
        while (valido2) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Entrada = base * 12;
            if (Entrada >= 70) {
                this.Entrada = Entrada;
                valido2 = false;
            } else {
                valido2 = true;
            }
        }
    }

    @Override
    public void calculoRatingNormal(int Agarre, int Lanzamiento, int Vision, int Passing, int Regate, int Disparo) {
        Random ran = new Random();
        int base = ran.nextInt(5) + 1;
        Agarre=base*13;
        this.Agarre=Agarre;
        int base1 = ran.nextInt(5) + 1;
        Lanzamiento=base1*13;
        this.Lanzamiento=Lanzamiento;
        int base2 = ran.nextInt(5) + 1;
        Vision=base2*13;
        this.Vision=Vision;
        int base3 = ran.nextInt(5) + 1;
        Passing=base3*13;
        this.Passing=Passing;
        int base4 = ran.nextInt(5) + 1;
        Regate=base4*13;
        this.Regate=Regate;
        int base5 = ran.nextInt(5) + 1;
        Disparo=base5*13;
        this.Disparo=Disparo;
    }
    
}
