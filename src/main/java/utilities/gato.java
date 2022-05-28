package utilities;

import interfaces.Sgato;

import java.util.logging.Level;
import java.util.logging.Logger;

public class gato extends animal implements Sgato {
    private final static Logger LOGGER = Logger.getLogger("logger");

    public gato(String nombre, String especie, String color, int edad, String sexo) {
        super(nombre, especie, color, edad, sexo);
    }


    public void lame() {
        LOGGER.log(Level.INFO, "Mi gato se baña al lamer");
    }

    public void aruñar() {
        LOGGER.log(Level.INFO, "Mi gato al jugar aruña mucho");
    }

    public void jugar() {
        LOGGER.log(Level.INFO, "Mi gato juega demasiado");
    }
}
