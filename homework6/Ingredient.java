public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() {
        return name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public String toString() {
        return "Ingredient\n" + "name=" + name + "\n" + "measuringUnit=" + measuringUnit + "\n" + "caloriesPerUnit=" + caloriesPerUnit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ingredient)) return false;
        Ingredient ingredient = (Ingredient) obj;
        
        return name.equals(ingredient.name) && measuringUnit.equals(ingredient.measuringUnit)
                && caloriesPerUnit == ingredient.caloriesPerUnit;
        }
        
    }

