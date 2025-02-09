public class sedan extends carro {

    int kilometraje;

    public sedan(String color, int kilometraje){
        super(color);
        this.kilometraje = kilometraje;
    }
    public String toString(){
        return "color: " + color +
                "\nkilometraje" + kilometraje;
    }
}

