
// 5.	Write a program to using marker interface create a class Product (product_id, product_name, product_cost, product_quantity) default and parameterized constructor. Create objectsof class product and display the contents of each object and Also display the object count.

import java.util.Scanner;

interface ProductMarker {
}

class Product implements ProductMarker {
    int id;
    String name;
    int cost;
    int quantity;

    Product() {
        id = 0;
        name = " ";
        cost = 0;
        quantity = 0;
    }

    Product(int id, String name, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }
}

public class Products {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int count = 0;
        System.out.println("How Many Products?");
        int number = a.nextInt();
        System.out.println("\n");
        Product products[] = new Product[number];
        System.out.println("Enter Product Data");
        a.nextLine(); // Consume the newline character left by nextInt()
        for (int i = 0; i < number; i++) {
            System.out.print("Enter Product Id: ");
            int id = a.nextInt();
            a.nextLine(); // Consume the newline character left by nextInt()
            System.out.print("Enter Product Name: ");
            String PName = a.nextLine();
            System.out.print("Enter Product Cost: ");
            int cost = a.nextInt();
            System.out.print("Enter Product Quantity: ");
            int qun = a.nextInt();
            System.out.println("\n");
            products[i] = new Product(id, PName, cost, qun);
            count++;
        }
        if (products[0] instanceof ProductMarker) {
            System.out.println("Class is using ProductMarker");
        }
        System.out.println(" Product details\n");
        for (Product product : products) {
            System.out.println("Product Id " + product.id);
            System.out.println("Product name " + product.name);
            System.out.println("Product cost " + product.cost);
            System.out.println("Product quantity " + product.quantity);
            System.out.println("\n");
        }
        System.out.println("Total objects: " + count);
        a.close();
    }
}
