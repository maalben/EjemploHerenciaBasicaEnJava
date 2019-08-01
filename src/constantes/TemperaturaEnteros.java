package constantes;

public enum TemperaturaEnteros {

    CERO(0),
    NUEVE(9),
    CINCO(5),
    TREINTAYDOS(32);

    private int valor;

    TemperaturaEnteros(int i) {
        this.valor = i;
    }

    public int getValor() {
        return valor;
    }
}
