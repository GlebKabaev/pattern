package factory;

public class CoffeeFactory {
    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType) {
            case AMERICANO: {
                coffee = new Americano();
                break;
            }

            case ESPRESSO: {
                coffee = new Espresso();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + coffeeType);
        }
        return coffee;
    }
}
