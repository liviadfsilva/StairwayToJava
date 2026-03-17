package stairway.to.java.ProductCategory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a category:");
        String userCategory = scanner.next().toUpperCase();

        ProductCategory productCategory = ProductCategory.valueOf(userCategory);

        switch (productCategory) {
            case ELETRONIC:
                System.out.println("Thank you for choosing the " 
                    + userCategory.toLowerCase() + " category!");
                break;
            case CLOTHING:
                System.out.println("Thank you for choosing the " 
                    + userCategory.toLowerCase() + " category!");
                break;
            case FOOD:
                System.out.println("Thank you for choosing the " 
                    + userCategory.toLowerCase() + " category!");
                break;
        }

        scanner.close();
    }
}
