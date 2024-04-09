package Part1;

import java.util.List;

public class NutritionPlanBuilder {
    private NutritionPlan nutritionPlan = new NutritionPlan();

    public NutritionPlanBuilder setCaloricIntake(int caloricIntake) {
        nutritionPlan.setCaloricIntake(caloricIntake);
        return this;
    }

    public NutritionPlanBuilder setMacronutrientRatios(int carbs, int proteins, int fats) {
        nutritionPlan.setMacronutrientRatios(new int[]{carbs, proteins, fats});
        return this;
    }

    public NutritionPlanBuilder setMealPlans(List<String> mealPlans) {
        nutritionPlan.setMealPlans(mealPlans);
        return this;
    }

    public NutritionPlanBuilder setFitnessGoal(String fitnessGoal) {
        nutritionPlan.setFitnessGoal(fitnessGoal);
        return this;
    }

    public NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions) {
        nutritionPlan.setDietaryRestrictions(dietaryRestrictions);
        return this;
    }

    public NutritionPlan build() {
        return nutritionPlan;
    }
}
