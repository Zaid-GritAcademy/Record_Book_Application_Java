package com.grit;


import java.io.File;

import java.util.Scanner;

public class RecordCatalogue {

    public static void main(String[] args) throws Exception {
        //state
        Student student ;




        // använder klasserna File och Scanner för att kunna läsa info från textfilen
        File file = new File("textFil.txt");
        Scanner scanner = new Scanner(file);




        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());







    }


}
