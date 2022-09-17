public abstract class CondimentDecorator extends Beverage{
  Beverage beverage;

  public abstract String getDescription();

  @Override
  public double cost() {
    return 0;
  }
}
