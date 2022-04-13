package builder;

public class NonVeganMealBuilder implements MealBuilder {       
   private Meal meal;    
    
   @Override
   public Meal buildMeal (){
      this.meal = new Meal();
      this.meal.addItem(new ChickenBurger());
      this.meal.addItem(new Coke());
      return this.meal;
   }
}
