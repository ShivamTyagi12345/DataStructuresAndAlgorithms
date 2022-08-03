package OOPsystem.Inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        super();
    }
    public BoxPrice(int i, int j, int k) {
        super(i, j, k);
        

    }

    BoxPrice(int l, int b, int h, int weight) {
        super(l, b, h, weight);
        this.cost = -1.0;

    }
// public class BoxPrice extends Dummy{

// }

}
