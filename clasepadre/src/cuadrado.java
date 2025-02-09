public class cuadrado extends Figura {

    double base;
    double altura;

    public cuadrado(double base){
        this.base = base;
    }

    public double calcularArea(){
        return base * base;
    }
}
