public class RecipeIngredient extends Ingredient{
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity){
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public void setQuantity(float quantity){
        this.quantity = quantity;
    }

    public float getQuantity(){
        return quantity;
    }

    public String toString() {
        return "RecipeIngredient\n" +
               "name=" + getName() + "\n" + "measuringUnit=" + getMeasuringUnit() + "\n" + "caloriesPerUnit=" + getCaloriesPerUnit() + "\n" + "quantity=" + quantity;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecipeIngredient other)) return false;
       
        if (!super.equals(o)) return false;
        return Float.compare(quantity, other.quantity) == 0;
    }
}