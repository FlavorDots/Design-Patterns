public class ChicagoStyleCheesePizza extends Pizza{

  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Saice";

    toppings.add("Shredded Mozzarella Cheese");
  }

  @Override
  void cut() {
    System.out.println("Cutting the pizaa into square slices");
  }
}
