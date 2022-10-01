package Adapter;

public class WildTurkey implements Turkey{


    @Override
    public void gobble() {
        System.out.println("GOBBLE GOBBLE");
    }

    @Override
    public void fly() {
        System.out.println("FLYING SHORT DISTANCES");
    }
}
