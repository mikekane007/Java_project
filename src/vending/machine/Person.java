package vending.machine;

import java.util.Scanner;
import java.io.*;

public class Person implements FileHandler{
    private String uname;
    private String password;
    private String fname;
    private String lname;
    private int age;
    private String Nationality;
    private char gender;
    
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
            String[] registerDetail = register();
            for (String  detail : registerDetail) {
                file.write(detail);
                file.write(",");
            }
            file.newLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public String[] register() {
        Scanner details = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        this.fname = details.next();

        System.out.print("Enter your last name: ");
        this.lname = details.next();

        System.out.print("Enter your username: ");
        this.uname = details.next();

        System.out.print("Enter your password: ");
        this.password = details.next();

        System.out.print("Enter your age: ");
        this.age = details.nextInt();

        System.out.print("Enter your country: ");
        this.Nationality = details.next();

        System.out.print("Enter your gender: ");
        this.gender = details.next().charAt(0);

       
        
        String[] personDetail = {this.fname,this.lname,this.uname,this.password,Integer.toString(this.age),this.Nationality,String.valueOf(this.gender)};
        return personDetail;
    }
    public boolean validate(String filePath,String username,String password){
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(","); 

            // checking for the first index
            if (fields.length > 0 && fields[2].equals(username)) {
                System.out.println("Found the username: " + username);
    
                
            }
            if (fields.length > 0 && fields[3].equals(password)) {
                System.out.println("Found the password: " + password);
                
                break;
            }
            
            
        }
    } catch (IOException e) {
        e.printStackTrace();

    }
    return true;
}
    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String enteruname = input.next();

        System.out.print("Enter your password: ");
        String enterpassword = input.next();

        validate("example.csv", enteruname,enterpassword);
        System.out.println(validate("example.csv", enteruname,enterpassword));
    }
    public static void main(String[] args) {
        
    }
}
