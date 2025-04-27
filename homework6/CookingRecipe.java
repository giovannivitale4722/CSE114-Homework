import java.util.ArrayList;
import java.util.Objects;

public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredients;

    public CookingRecipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        RecipeIngredient existing = getRecipeIngredient(ingredient);
        if (existing != null) {
            existing.setQuantity(quantity);
        } else {
            ingredients.add(new RecipeIngredient(
                    ingredient.getName(),
                    ingredient.getMeasuringUnit(),
                    ingredient.getCaloriesPerUnit(),
                    quantity));
        }
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.equals(new RecipeIngredient(
                    ingredient.getName(),
                    ingredient.getMeasuringUnit(),
                    ingredient.getCaloriesPerUnit(),
                    ri.getQuantity()))) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getName().equals(ingredientName)) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        RecipeIngredient target = getRecipeIngredient(ingredient);
        if (target != null) {
            ingredients.remove(target);
        }
        return target;
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        RecipeIngredient target = getRecipeIngredient(ingredientName);
        if (target != null) {
            ingredients.remove(target);
        }
        return target;
    }

    public float calculateCalories() {
        float total = 0f;
        for (RecipeIngredient ri : ingredients) {
            total += ri.getCaloriesPerUnit() * ri.getQuantity();
        }
        return total;
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CookingRecipe))
            return false;
        CookingRecipe that = (CookingRecipe) o;
        return Objects.equals(name, that.name)
                && Objects.equals(ingredients, that.ingredients);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CookingRecipe\n")
                .append("name=").append(name).append("\n");
        for (RecipeIngredient ri : ingredients) {
            sb.append(ri.toString()).append("\n");
        }
        return sb.toString().trim();
    }

}
