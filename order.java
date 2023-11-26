
// 4.	Create an abstract class “order” having members id, description. Create two subclasses “Purchase Order” and “Sales Order” having members customer name and Vendor name respectively. Define methods accept and display in all cases. Create 3 objects each of Purchase Order and Sales Order and accept and display details.

import java.util.*;
import java.io.*;

public abstract class order {
    int id;
    String description;

    public static void main(String[] args) throws Exception {

        Purchase_Order po = new Purchase_Order();
        System.out.println("Purchase Detailes ");
        System.out.println("\n");
        po.accept();
        System.out.println("\n");
        po.Display();
        final Sales_Order so = new Sales_Order();
        System.out.println("\n");
        so.accept();
        System.out.println("\n");
        so.Display();
    }
}

class Purchase_Order extends order {
    String Cus_Name, ven_Name;

    void accept() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter description of product:");
        description = sc.nextLine();
        System.out.print("Enter Name of customer:");
        Cus_Name = sc.nextLine();
        System.out.print("Enter name of vendor:");
        ven_Name = sc.nextLine();
        System.out.println("-----------------------------------");
        sc.close();
    }

    void Display() {
        System.out.println("id:" + id);
        System.out.println("Description:" + description);
        System.out.println("Customer Name:" + Cus_Name);
        System.out.println("Vendor Name:" + ven_Name);
        System.out.println("-----------------------------------");
    }
}

class Sales_Order extends order {
    String Cus_Name, ven_Name;

    void accept() {
        System.out.println("Order Detailes Are");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter description of product:");
        description = sc.next();
        System.out.print("Enter Name of customer:");
        Cus_Name = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter name of vendor:");
        ven_Name = sc.nextLine();
        System.out.println("-----------------------------------");
        sc.close();
    }

    void Display() {
        System.out.println("Order Detailes");
        System.out.println("id:" + id);
        System.out.println("Description:" + description);
        System.out.println("Customer Name:" + Cus_Name);
        System.out.println("Vendor Name:" + ven_Name);
        System.out.println("-----------------------------------");
    }
}
