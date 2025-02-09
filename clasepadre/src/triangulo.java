public class triangulo extends Figura {

    double base;
    double altura;

    public triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }


    public double calcularArea(){
        return (base * altura) / 2;
    }
}
