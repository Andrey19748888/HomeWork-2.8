import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    static Set<Recipes> recipes  = new HashSet<>();
    private String manyProducts;
    private double totalCost;
    private  String recipeName;

    public Recipes(String manyProducts, double totalCost, String recipeName) {
        this.manyProducts = manyProducts;
        this.totalCost = totalCost;
        this.recipeName = recipeName;
    }

    public void addRecipes() throws Exception
    { if (!recipes.contains(this)) {
        recipes.add(this);
    } else {
        throw new Exception("Рецепты не могут иметь одинаковое название");
    }

    }

    public static Set<Recipes> getRecipes() {
        return recipes;
    }

    public String getManyProducts() {
        return manyProducts;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getRecipeName() {
        return recipeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return  Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}




