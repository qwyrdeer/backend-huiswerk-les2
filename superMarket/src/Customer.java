package PACKAGE_NAME;

import java.util.Objects;

public class Customer {
    public String costumerName;
    public superMarket supermarket;

    public Customer(String name) {
        this.costumerName = name;
    }
    public void goToSuperMarket(superMarket supermarket) {
        this.supermarket = supermarket;

    }

    public void buyItem(String productName, int amount) {
        if(Objects.equals(productName, superMarket.bread.name)) {
            superMarket.buyBread(amount);
        } else if (Objects.equals(productName, superMarket.fruit.name)) {
            superMarket.buyFruit(amount);
        } else if (Objects.equals(productName, superMarket.cheese.name)) {
            superMarket.buyCheese(amount);
        } else if (Objects.equals(productName, superMarket.toiletpaper.name)|| productName.equals("toilet paper")) {
            superMarket.buyToiletpaper(amount);
        } else {
            System.out.println("Currently not available.");
        }
    }

}
