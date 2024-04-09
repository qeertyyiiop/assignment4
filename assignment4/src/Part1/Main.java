package Part1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NutritionPlanBuilder builder = new WeightGainNutritionPlanBuilder();
        builder.setCaloricIntake(2500)
                .setMacronutrientRatios(50, 25, 25)
                .setMealPlans(List.of("Breakfast: Scrambled Eggs with Avocado", "Lunch: Beef and Rice Bowl", "Dinner: Pasta with Meatballs"))
                .setFitnessGoal("weight gain")
                .setDietaryRestrictions(List.of());

        NutritionPlanDirector director = new NutritionPlanDirector();
        director.setBuilder(builder);

        NutritionPlan nutritionPlan = director.createNutritionPlan();
        System.out.println("Weight Gain Nutrition Plan:");
        System.out.println(nutritionPlan);

        builder = new MaintenanceNutritionPlanBuilder();
        builder.setCaloricIntake(2200)
                .setMacronutrientRatios(40, 30, 30)
                .setMealPlans(List.of("Breakfast: Greek Yogurt with Granola", "Lunch: Turkey Sandwich", "Dinner: Grilled Salmon with Vegetables"))
                .setFitnessGoal("maintenance")
                .setDietaryRestrictions(List.of());

        director.setBuilder(builder);

        nutritionPlan = director.createNutritionPlan();
        System.out.println("\nMaintenance Nutrition Plan:");
        System.out.println(nutritionPlan);
    }
}
