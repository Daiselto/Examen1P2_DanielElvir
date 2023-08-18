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
public class Portero extends Jugador {

    public Portero() {
        super();
    }

    public Portero(String Nombre, int Edad, String Nacionalidad, String Pie_Habil) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil);
    }

    public Portero(String Nombre, int Edad, String Nacionalidad, String Pie_Habil, int Rating, Exam1P2_DanielElvir.Equipo Equipo, int Agarre, int Lanzamiento, int Fisica, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        super(Nombre, Edad, Nacionalidad, Pie_Habil, Rating, Equipo, Agarre, Lanzamiento, Fisica, Ritmo, Entrada, Vision, Passing, Regate, Disparo);
    }

    @Override
    public String toString() {
        return "Nombre del Portero: " + super.toString();
    }

    @Override
    public void calculoRatingEspecial(int Agarre, int Lanzamiento, int Passing) {
        boolean valido = true;
        while (valido) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Agarre = base * 12;
            if (Agarre >= 70) {
                this.Agarre = Agarre;
                valido = false;
            } else {
                valido = true;
            }
        }

        boolean valido1 = true;
        while (valido1) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Lanzamiento = base * 12;
            if (Lanzamiento >= 70) {
                this.Lanzamiento = Lanzamiento;
                valido1 = false;
            } else {
                valido1 = true;
            }
        }

        boolean valido2 = true;
        while (valido2) {
            Random ran = new Random();
            int base = ran.nextInt(12) + 1;
            Passing = base * 12;
            if (Passing >= 70) {
                this.Passing = Passing;
                valido2 = false;
            } else {
                valido2 = true;
            }
        }

    }

    @Override
    public void calculoRatingNormal(int Fisico, int Ritmo, int Entrada, int Vision, int Regate, int Disparo) {
        Random ran = new Random();
        int base = ran.nextInt(5) + 1;
        Fisico=base*13;
        this.Fisica=Fisico;
        int base1 = ran.nextInt(5) + 1;
        Ritmo=base1*13;
        this.Ritmo=Ritmo;
        int base2 = ran.nextInt(5) + 1;
        Entrada=base2*13;
        this.Entrada=Entrada;
        int base3 = ran.nextInt(5) + 1;
        Vision=base3*13;
        this.Vision=Vision;
        int base4 = ran.nextInt(5) + 1;
        Regate=base4*13;
        this.Regate=Regate;
        int base5 = ran.nextInt(5) + 1;
        Disparo=base5*13;
        this.Disparo=Disparo;

    }

}
