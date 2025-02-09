public class AppCarros {
    public static void main(String[] args) {

        sedan sedan = new sedan ("rojo", 10000);
        SUV suv = new SUV(true, "azul");
        SUV suv1 = new SUV(true, "azul");
        System.out.println(sedan.toString());
        System.out.println(suv1.toString());
    }

}
