package vending.machine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Owner implements FileHandler{
    String foodName;
    int numOfFood;
    float price;

    public String[] addFood(){
        Scanner foodDetails = new Scanner(System.in);
        System.out.println("enter the food name");
        this.foodName = foodDetails.next();
        System.out.println("enter the number of food to be added");
        this.numOfFood = foodDetails.nextInt();
        System.out.println("enter the food price");
        this.price = foodDetails.nextFloat();
        String[] foodDetail = {this.foodName,String.valueOf(this.numOfFood),String.valueOf(this.price)};
        return foodDetail;
    }
    @Override
    public void createFile(String filePath){
        try {
            
            File file = new File(filePath);
           if(file.exists() == false){
               try {
                   file.createNewFile();
               } catch (Exception e) {
                   System.out.println(e.getMessage().toString());
               }
           }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    @Override
    public void writeFile(String filePath){
        createFile(filePath);
        try (BufferedWriter file = new BufferedWriter(new FileWriter(filePath,true))){
            String[] registerFood = addFood();
            for (String  detail : registerFood) {
                file.write(detail);
                file.write(",");
            }
            file.newLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    // -----------------------------------------------------come back----------------------------------------------------------------------
    // public void removeItem(String filePath,String foodName){
    //     try (BufferedReader writer = new BufferedReader(new FileReader(filePath))) {
    //     String line;
    //     while ((line = writer.readLine()) != null) {
    //         String[] fields = line.split(","); 

    //         // checking for the first index
    //         if (fields.length > 0 && fields[0].equals(foodName)) {
                
    //             System.out.println("Item has been deleted");
    //             break;
    //         }            
            
    //     }
    // } catch (IOException e) {
    //     e.printStackTrace();

    // }
    // }
//     public static void main(String[] args) {
//         new Owner().removeItem("food.csv", "coke");
//     }
}
