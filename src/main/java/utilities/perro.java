package utilities;

import interfaces.Sperro;

import java.util.logging.Level;
import java.util.logging.Logger;

public class perro extends animal implements Sperro {
    private final static Logger LOGGER = Logger.getLogger("logger");

    public perro(String nombre, String especie, String color, int edad, String sexo) {
        super(nombre, especie, color, edad, sexo);
    }

    public void ladrar() {
        LOGGER.log(Level.INFO, "El perro de la casa ladra mjy fuerte!!");
    }

    public void cuidar() {
        LOGGER.log(Level.INFO, "El perro de mi casa cuida muy bien de ella");
    }

    public void jugar() {
        LOGGER.log(Level.INFO, "Mi perro No se cansa de jugar");
    }
}
