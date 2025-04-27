import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RecipeBook {
    private final String bookName;
    private final List<CookingRecipe> recipes;

    
    public RecipeBook(String bookName) {
        this.bookName = bookName;
        this.recipes = new ArrayList<>();
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
    
        for (CookingRecipe r : recipes) {
            if (r.getName().equals(name)) {
                return null;
            }
        }
    
        CookingRecipe recipe = new CookingRecipe(name);
        for (RecipeIngredient ri : ingredients) {
            recipe.addOrUpdateRecipeIngredient(ri, ri.getQuantity());
        }
        recipes.add(recipe);
        return recipe;
    }
    public CookingRecipe removeRecipe(String name) {
        for (int i = 0; i < recipes.size(); i++) {
            CookingRecipe r = recipes.get(i);
            if (r.getName().equals(name)) {
                return recipes.remove(i);
            }
        }
        return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        List<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe r : recipes) {
            boolean hasAll = true;
            for (RecipeIngredient ri : ingredients) {
                if (r.getRecipeIngredient(ri) == null) {
                    hasAll = false;
                    break;
                }
            }
            if (hasAll) matches.add(r);
        }
        return matches.isEmpty() ? null : matches.toArray(new CookingRecipe[matches.size()]);
    }

    
    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        List<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe r : recipes) {
            if (r.getNumberOfIngredients() <= numberOfIngredients) {
                matches.add(r);
            }
        }
        return matches.isEmpty() ? null : matches.toArray(new CookingRecipe[matches.size()]);
    }

    
    public CookingRecipe[] findRecipesLowCalories() {
        if (recipes.isEmpty()) return null;
        float minCal = Float.MAX_VALUE;
        for (CookingRecipe r : recipes) {
            float cal = r.calculateCalories();
            if (cal < minCal) minCal = cal;
        }
        List<CookingRecipe> matches = new ArrayList<>();
        for (CookingRecipe r : recipes) {
            if (Float.compare(r.calculateCalories(), minCal) == 0) {
                matches.add(r);
            }
        }
        return matches.toArray(new CookingRecipe[matches.size()]);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeBook other)) return false;
        return Objects.equals(bookName, other.bookName)
            && Objects.equals(recipes, other.recipes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecipeBook\n");
        sb.append("bookName=").append(bookName).append("\n");
        for (CookingRecipe r : recipes) {
            sb.append(r.toString()).append("\n");
        }
        return sb.toString().trim();
    }
}
