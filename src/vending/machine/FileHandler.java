/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vending.machine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author PC
 */
interface FileHandler {
    void createFile(String filePath);
    void writeFile(String filePath);
    // public void createFile(String filePath){
    //     File file = new File(filePath);
    //     if(file.exists() == false){
    //         try {
    //             file.createNewFile();
    //         } catch (Exception e) {
    //             System.out.println(e.getMessage().toString());
    //         }
    //     }

    // }
    // public void writeFile(String filePath){
    //     createFile(filePath);
    //     try (BufferedWriter file = new BufferedWriter(new FileWriter(filePath,true))){
    //         String[] registerDetail = new Person().register();
    //         for (String  detail : registerDetail) {
    //             file.write(detail);
    //             file.write(",");
    //         }
    //         file.newLine();
    //     } catch (Exception e) {
    //         // TODO: handle exception
    //     }
    // }
    // public static void main(String[] args) {
    //     new FileHandler().writeFile("example.csv");
    // }
}
