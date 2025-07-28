package application;
import controller.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        
       Locale.setDefault(Locale.US); 
       Scanner lerVar = new Scanner(System.in);
       
       Product product = new Product();
       System.out.println("Enter product data: ");

       System.out.print("Name:");
       product.name = lerVar.nextLine(); 

       System.out.print("Price:");
       product.price = lerVar.nextDouble();

       System.out.print("Quantity in Stock:");
       product.quantity = lerVar.nextInt();
     
       System.out.println(); 
       System.out.println("Product Data:" + product);

       System.out.println();
       System.out.println("Enter the numbers of productcs to be added in Stock:");
       int quantity = lerVar.nextInt();
       product.addProducts(quantity);

       System.out.println();
       System.out.println("Update Data" + product);
      
       System.out.println();
       System.out.print("Enter the numbers of products to be removed from stock");
       quantity = lerVar.nextInt();
       product.removeProducts(quantity);

       System.out.println();
       System.out.println("Update Data" + product);

       System.out.println(product.name + ", " + product.price + ", " + product.quantity); 

       lerVar.close();
    }
}
