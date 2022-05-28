package utilities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class animal {

    private static final Logger LOGGER = Logger.getLogger("LOGGER");
    String nombre;
    String especie;
    int edad;
    String sexo;
    String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombreombre(String nombre) {
        this.nombre = nombre;
    }

    //  generamos el Constructor
    animal(String Nombre, String Especie, String Color, int Edad, String Sexo) {
        this.nombre = Nombre;
        this.especie = Especie;
        this.color = Color;
        this.edad = Edad;
        this.sexo = Sexo;

    }
    //  generamos los Getter and Setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void caminar() {
        LOGGER.log(Level.INFO, "Caminando");
    }

    public void descansar() {
        LOGGER.log(Level.INFO, "descansar");
    }
}
