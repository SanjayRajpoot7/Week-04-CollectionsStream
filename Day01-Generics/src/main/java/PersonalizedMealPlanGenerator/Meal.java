package PersonalizedMealPlanGenerator;

// Step 3: Create a generic Meal class that accepts any MealPlan type
public class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void displayMeal() {
        mealPlan.displayMealType();
    }

    public void meal() {
        System.out.println("Creating a personalized meal plan...");
        displayMeal();  // Show the meal type using displayMeal()
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
