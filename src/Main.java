import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product kiwi = new Product(20, 4.1, "киви");
        Product kiwi2 = new Product(40,4.1,"киви");

        System.out.println(kiwi);
        System.out.println(kiwi2);

        try {
            kiwi.add();

            System.out.println(Product.products);

            kiwi2.add();

            System.out.println(Product.products);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }

        Recipes greekSalad = new Recipes("сыр,салат",5.4,"греческий салат");
        try {
            greekSalad.addRecipes();

            System.out.println();

            greekSalad.addRecipes();

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }






    }
}