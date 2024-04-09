package Part1;

import java.util.List;

public class NutritionPlan {
    private int caloricIntake;
    private int[] macronutrientRatios;
    private List<String> mealPlans;
    private String fitnessGoal;
    private List<String> dietaryRestrictions;

    public void setCaloricIntake(int caloricIntake) {
        this.caloricIntake = caloricIntake;
    }

    public void setMacronutrientRatios(int[] macronutrientRatios) {
        this.macronutrientRatios = macronutrientRatios;
    }

    public void setMealPlans(List<String> mealPlans) {
        this.mealPlans = mealPlans;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public void setDietaryRestrictions(List<String> dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    @Override
    public String toString() {
        return "Caloric Intake: " + caloricIntake + "\n" +
                "Macronutrient Ratios: " + macronutrientRatios[0] + "% carbs, " + macronutrientRatios[1] + "% proteins, " + macronutrientRatios[2] + "% fats\n" +
                "Meal Plans: " + mealPlans + "\n" +
                "Fitness Goal: " + fitnessGoal + "\n" +
                "Dietary Restrictions: " + dietaryRestrictions;
    }
}
