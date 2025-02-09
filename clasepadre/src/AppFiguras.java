public class AppFiguras {

    public static void main(String[] args) {
        circulo circle = new circulo(10);
        triangulo triangulo = new triangulo (2,3);
        rectangulo rectangle = new rectangulo (2,3);
        cuadrado square = new cuadrado (5);

        System.out.println("el area del circulo; " + circle.calcularArea() );
        System.out.println("el area del cuadrado; " + square.calcularArea() );
        System.out.println("el area del triangulo; " + triangulo.calcularArea() );
        System.out.println("el area del rectangulo; " + rectangle.calcularArea() );
    }
}
