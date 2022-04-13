package builder;

public class Main {         
    
    public void construct() {
        MealBuilder builder;
        
        builder = new VeganMealBuilder();
        Meal vegMeal = builder.buildMeal();
        System.out.println("Vegan Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        builder = new NonVeganMealBuilder();
        Meal nonVegMeal = builder.buildMeal();
        System.out.println("\n\nNon-Vegan Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
   }
    
    public static void main(String[] args) {
        Main director = new Main();        
        director.construct();    
    }
}
