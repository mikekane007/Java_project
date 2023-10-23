package vending.machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Card {
    String cardno = "";
    String cardCode = "";
    public void registerCard(){
        Scanner cardDetails = new Scanner(System.in);
        System.out.print("enter card number:");
        this.cardno = cardDetails.next();

        System.out.print("enter card secrete 3 digit code:");
        this.cardCode = cardDetails.next();

        try {
            File register = new File("cardDetail.csv");
            if (!register.exists()) {
                register.createNewFile();
            }

            BufferedWriter wregister = new BufferedWriter(new FileWriter("cardDetail.csv", true));
            wregister.write(this.cardno + ",");
            wregister.write(this.cardCode );

            wregister.write("\n");  // Add a line terminator to move to the next line
            wregister.close();  // Close the writer to release resources
            System.out.println("Data written");
        } catch (IOException e) {
            e.printStackTrace();
        }
    

    }

    // implement card payment method.
}
