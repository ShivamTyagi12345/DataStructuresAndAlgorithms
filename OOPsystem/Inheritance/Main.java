package OOPsystem.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxPrice box1=new BoxPrice(1, 2, 3, 19);
        System.out.println(box1.cost);

        BoxPrice box2=new BoxPrice();
        System.out.println(box2.weight);
    }
    
}
