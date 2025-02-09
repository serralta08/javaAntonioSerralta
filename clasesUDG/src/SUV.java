public class SUV extends carro {
    boolean cuatroRuedas;

    public SUV(boolean cuatroRuedas, String color) {
        super(color);
        this.cuatroRuedas = cuatroRuedas;

    }

    public String toString() {

        return "color: " + color +
                "\ncuatro ruedas: " + cuatroRuedas;
    }
}
