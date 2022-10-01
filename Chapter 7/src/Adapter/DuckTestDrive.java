package Adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("TURKEY SAYS ..........");
        turkey.gobble();
        turkey.fly();

        System.out.println("DUCK SAYS ..........");
        testDuck(duck);

        System.out.println("TURKEYADAPTER SAYS .......");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
