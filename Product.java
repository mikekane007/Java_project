public class Product{
    private String name;
    private double price;
    private int quantity;

public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

public String getname(){
    return name;
}

public void setName(String name){
    this.name=name;
}

public double getPrice(){
    return price;
}

public void setPrice(){
    this.price = price;
}

public int getQuantity(){
    return quantity;
}

public void setQuantity(){
    this.quantity = quantity;
}

@Override
public String toString(){
    return name + " - $" + price;
}

public void purchase(int quantityToPurchase){
    if (this.quantity >= quantityToPurchase){
        this.quantity -= quantityToPurchase;
        System.out.println("Purchase successful");
    } else {
        System.out.println("The requested amount exceeds our inventory.");
    }

}
public void displayProductInformation(){
    System.out.println("Product Name:  " + name);
    System.out.println("Price:  $" + price);
    System.out.println("Remaining Quantity:  " + quantity);
}   

}