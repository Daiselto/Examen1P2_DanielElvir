
package Exam1P2_DanielElvir;


public abstract class Jugador {
    private String Nombre;
    private int Edad;
    private String Nacionalidad;
    private String Pie_Habil;
    private int Rating;
    private Equipo Equipo;
    private int Agarre, Lanzamiento, Fisica, Ritmo, Entrada, Vision, Passing, Regate, Disparo;

    public Jugador() {
    }

    public Jugador(String Nombre, int Edad, String Nacionalidad, String Pie_Habil) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.Pie_Habil = Pie_Habil;
    }

    public Jugador(String Nombre, int Edad, String Nacionalidad, String Pie_Habil, int Rating, Equipo Equipo, int Agarre, int Lanzamiento, int Fisica, int Ritmo, int Entrada, int Vision, int Passing, int Regate, int Disparo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Nacionalidad = Nacionalidad;
        this.Pie_Habil = Pie_Habil;
        this.Rating = Rating;
        this.Equipo = Equipo;
        this.Agarre = Agarre;
        this.Lanzamiento = Lanzamiento;
        this.Fisica = Fisica;
        this.Ritmo = Ritmo;
        this.Entrada = Entrada;
        this.Vision = Vision;
        this.Passing = Passing;
        this.Regate = Regate;
        this.Disparo = Disparo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getPie_Habil() {
        return Pie_Habil;
    }

    public void setPie_Habil(String Pie_Habil) {
        this.Pie_Habil = Pie_Habil;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public Equipo getEquipo() {
        return Equipo;
    }

    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }

    public int getAgarre() {
        return Agarre;
    }

    public void setAgarre(int Agarre) {
        this.Agarre = Agarre;
    }

    public int getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(int Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public int getFisica() {
        return Fisica;
    }

    public void setFisica(int Fisica) {
        this.Fisica = Fisica;
    }

    public int getRitmo() {
        return Ritmo;
    }

    public void setRitmo(int Ritmo) {
        this.Ritmo = Ritmo;
    }

    public int getEntrada() {
        return Entrada;
    }

    public void setEntrada(int Entrada) {
        this.Entrada = Entrada;
    }

    public int getVision() {
        return Vision;
    }

    public void setVision(int Vision) {
        this.Vision = Vision;
    }

    public int getPassing() {
        return Passing;
    }

    public void setPassing(int Passing) {
        this.Passing = Passing;
    }

    public int getRegate() {
        return Regate;
    }

    public void setRegate(int Regate) {
        this.Regate = Regate;
    }

    public int getDisparo() {
        return Disparo;
    }

    public void setDisparo(int Disparo) {
        this.Disparo = Disparo;
    }

    @Override
    public String toString() {
        return "Nombre del Jugador: " + Nombre;
    }
    
    public abstract void calculoRating();
    
}
