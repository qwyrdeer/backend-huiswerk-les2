package PACKAGE_NAME;

public class superMarket {
    static Product bread;
    static Product fruit;
    static Product toiletpaper;
    static Product cheese;

    public superMarket(Product bread, Product fruit, Product toiletpaper, Product cheese) {
        this.bread = bread;
        this.fruit = fruit;
        this.toiletpaper = toiletpaper;
        this.cheese = cheese;
    }

    private static void buyItem(Product product, int amount) {
        if (amount < product.amount) {
            System.out.println("You bought " + amount + " " + product.name + " for " + product.price*amount + " euro");
        } else {
            System.out.println("You cannot buy " + amount + " " +  product.name + ", we only have " + amount + " " + product.name + " in stock.");
        }
    }

    public static void buyBread(int amount) {
        buyItem(bread, amount);
    }
    public static void buyFruit(int amount) {
        buyItem(fruit, amount);
    }
    public static void buyToiletpaper(int amount) {
        buyItem(toiletpaper, amount);
    }
    public static void buyCheese(int amount) {
        buyItem(cheese, amount);
    }

}
