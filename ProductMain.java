
import java.util.Scanner;
public class ProductMain {
    public static void main(String[] args){

        Product product = new Product("Soda", 1.50, 5);
        product.displayProductInformation();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("\nEnter quantity of soda you want to buy: ");
        int quantityToPurchase = Integer.valueOf(reader.nextLine()); 

        if(product.getQuantity() >= quantityToPurchase){
            product.setQuantity();
            System.out.println("Purchase successful!");
        } else {
            System.out.println("Sorry, the product you're looking for is out of stock");
        }
    
        }

    }

