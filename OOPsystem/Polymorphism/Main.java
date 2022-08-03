package OOPsystem.Polymorphism;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Shapes shapes=new Shapes();
        Shapes circle=new Circle();
         
        shapes.area();
        circle.area();
    }

    
}