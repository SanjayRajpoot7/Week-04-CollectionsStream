package PersonalizedMealPlanGenerator;

public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T mealPlan) {
        System.out.println("Generating personalized meal plan...");
        mealPlan.displayMealType();
    }

    public static void main(String[] args) {
        // Create specific meal types
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        // Display meal plans using the generic method
        generateMealPlan(vegetarianMeal.getMealPlan());
        generateMealPlan(veganMeal.getMealPlan());
        generateMealPlan(ketoMeal.getMealPlan());
        generateMealPlan(highProteinMeal.getMealPlan());

        // You can also directly call display from the meal objects
        vegetarianMeal.displayMeal();
        veganMeal.displayMeal();
        ketoMeal.displayMeal();
        highProteinMeal.displayMeal();
    }
}
