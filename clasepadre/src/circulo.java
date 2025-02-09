public class circulo extends Figura {

    double radio;


    public circulo(double radio){
        this.radio = radio;

    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);

    }


}
