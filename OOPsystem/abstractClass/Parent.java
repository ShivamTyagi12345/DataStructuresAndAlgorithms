package OOPsystem.abstractClass;

public abstract class Parent {
    abstract void carrer();

    abstract void partner();

        // Can i create abstract constructor IE, can i create an object of the abstract
        // class: N0
        // abstract Parent()
        // Illegal modifier for the constructor in type Parent; only public, protected &
        // private are permitted


    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("this is a normal method");
    }

}
