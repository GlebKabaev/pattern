package factory;

public class CoffeeMachine {

    private void boilWater() {
        System.out.println("вода нагрета");
    }

     void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.getCoffee(coffeeType);
        boilWater();
        System.out.println("добавляем "+coffee.amountOfWater()+" воды");
    }
}
