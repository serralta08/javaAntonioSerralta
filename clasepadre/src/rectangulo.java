public class rectangulo extends Figura {

    double altura;
    double base;

    public rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;

    }

    public double calcularArea(){
        return base * altura;
    }

}
