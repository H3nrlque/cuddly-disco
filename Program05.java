package application;

import entities.Product05;

import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = tc.nextLine();
        System.out.print("Price: $");
        double price = tc.nextDouble();
        Product05 product05 = new Product05(name, price);

        product05.setName("Computer");
        System.out.println("Updated name: "+product05.getName());

        product05.setPrice(2000.00);

        System.out.println("Updated price: "+product05.getPrice());

        System.out.println();
        System.out.println("Product data: "+product05);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int q = tc.nextInt();
        product05.AddProducts(q);

        System.out.println();
        System.out.print("Updated data: "+product05);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        q = tc.nextInt();
        product05.RemoveProducts(q);

        System.out.println();
        System.out.println("Updated data: "+product05);




        tc.close();
    }
}
