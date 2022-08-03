package OOPsystem.access;

public class Subclass extends A{
    int branch;

    Subclass(int num, String name,int branch) {
        super(num, name);
        //TODO Auto-generated constructor stub
        this.branch=branch;
    }
    public static void main(String[] args) {
        Subclass obj=new Subclass(10, "name", 4);
        System.out.println(obj.num);
        
    }
    
}
