package conversion;

import static constantes.TemperaturaEnteros.NUEVE;
import static constantes.TemperaturaEnteros.CINCO;
import static constantes.TemperaturaEnteros.TREINTAYDOS;

public class TemperaturaLogica extends Temperatura {

    public double calcularTemperaturaFarenheit(){
        return (this.getCentigrados() * NUEVE.getValor()/CINCO.getValor()) + TREINTAYDOS.getValor();
    }
}