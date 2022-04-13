package builder;

public class VeganMealBuilder implements MealBuilder {
    private Meal meal;
    
    @Override
    public Meal buildMeal (){
      this.meal = new Meal();
      this.meal.addItem(new VeganBurger());
      this.meal.addItem(new Juice());
      return this.meal;
    }   
}
