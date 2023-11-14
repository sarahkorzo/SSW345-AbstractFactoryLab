public class MyPizzaApp {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: MyPizzaApp <franchise> <pizzaKind>");
            System.exit(1);
        }

        String franchise = args[0];
        String pizzaKind = args[1];

        PizzaStore pizzaStore;

        // Create the appropriate PizzaStore based on user input
        if (franchise.equalsIgnoreCase("NYPizzaStore")) {
            pizzaStore = new NYPizzaStore();
        } else if (franchise.equalsIgnoreCase("ChicagoPizzaStore")) {
            // Add implementation for ChicagoPizzaStore if needed
            pizzaStore = new ChicagoPizzaStore();
        } else {
            System.out.println("Invalid franchise");
            System.exit(1);
            return;  // Ensure the application exits
        }

        // Order the specified pizza
        pizzaStore.orderPizza(pizzaKind);
    }
}
