package OOPsystem.Inheritance;

public class BoxWeight extends Box {
    int weight;

    BoxWeight() {
        super();
        this.weight = 19;
    }

    BoxWeight(int l, int b, int h) {
        super(l, b, h);
        this.weight = 20;
    }

    BoxWeight(int l, int b, int h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

}
