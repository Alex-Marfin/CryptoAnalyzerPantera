package com.javarush.marfin;


import java.util.Scanner;

public class App implements Messags {

    public static void main(String[] args) {
        String inputFile = "";
        String outputFile = "";
        int key = 0;
        Scanner scanner = new Scanner(System.in);
        Chipher chipher = new Chipher();
        System.out.println(MENU);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().equals("1")) {
                System.out.println("Enter source (full path OR only filename OR Enter for text.txt) :");
                inputFile = scanner.nextLine();
                if (inputFile.equals("")) {
                    inputFile = "C:\\Users\\Alex\\IdeaProjects\\CryptoAnalyzerPantera\\text\\text.txt";
                }
                System.out.println("Enter destination (full path OR only filename OR Enter for decrypted.txt) :");
                outputFile = scanner.nextLine();
                if (outputFile.equals("")) {
                    outputFile = "C:\\Users\\Alex\\IdeaProjects\\CryptoAnalyzerPantera\\text\\encrypted.txt";
                }
                System.out.println("Enter key (int number OR Enter for key=1) :");
                key = Integer.parseInt(scanner.nextLine());
                chipher.encrypt(inputFile, outputFile, key);
                System.out.println("Operation complete");
            }
        }

    }
}



