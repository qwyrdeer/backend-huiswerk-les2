package PACKAGE_NAME;

import java.beans.Customizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product fruit = new Product("fruit", 2.5, 30);
        Product bread = new Product("bread", 2.5, 30);
        Product cheese = new Product("cheese", 2.5, 30);
        Product toiletpaper = new Product("toiletpaper", 2.5, 30);

        superMarket superMarket = new superMarket(bread, fruit, cheese, toiletpaper);
        Customer klant = new Customer("Wessel");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What product do you want to buy?");
        String productName = scanner.nextLine().toLowerCase();
        System.out.println("What amount do you want to buy?");
        int amount = scanner.nextInt();

        klant.goToSuperMarket(superMarket);
        klant.buyItem(productName, amount);
    }

    }