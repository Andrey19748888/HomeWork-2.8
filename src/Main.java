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

        System.out.println();
        System.out.println();

        Passport passport = new Passport(12345, "Антонов", "Илья", null, "01.01.2001");
        Passport passport2 = passport;
        Passport passport3 = new Passport(12345, "Борисов", "Петр", null, "23.02.1998");

        passport.equals(passport2);
        passport.equals(passport3);
        passport2.equals(passport3);

        passport.addToSet();

        System.out.println(Passport.passports);

        passport3.addToSet();

        System.out.println(Passport.passports);

        passport2.addToSet();

        System.out.println(Passport.passports);

        System.out.println(Passport.getByNumber(12345));







    }
}