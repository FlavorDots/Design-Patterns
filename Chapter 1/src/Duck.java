public abstract class Duck {

  protected FlyBehaviour flyBehaviour;
  protected QuackBehaviour quackBehaviour;

  public Duck() {
  }

  public void swim(){
    System.out.println("All ducks float, even decoys!");
  }

  public void display(){}

  public void performQuack(){
    quackBehaviour.quack();
  }

  public void performFly(){
    flyBehaviour.fly();
  }

  public void setFlyBehaviour(FlyBehaviour fb){
    flyBehaviour = fb;
  }

  public void setQuackBehaviour(QuackBehaviour qb){
    quackBehaviour = qb;
  }




}
