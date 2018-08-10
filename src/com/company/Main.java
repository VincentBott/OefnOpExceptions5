package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Winkelmandje mandje = new Winkelmandje();

        boolean nogEenProduct = true;

        do{
            System.out.print("Geef naam van product: ");
            String naam = scanner.nextLine();
            System.out.print("Geef prijs van product: ");

            int prijs = Integer.parseInt(scanner.nextLine());

            try {

                mandje.addProduct(naam, prijs);

                System.out.print("Wilt u nog een product toevoegen? ");
                String antwoord = scanner.nextLine();

                if (!antwoord.toLowerCase().startsWith("j")){
                    nogEenProduct = false;
                }

            } catch(IllegalArgumentException ex){
                System.out.println("Fout: " + ex.getMessage());
                nogEenProduct = false;
            }
s
        } while(nogEenProduct);

        System.out.println("De producten: ");

        for(int i = 0; i<mandje.getAantalProducten();i++){
            System.out.printf("%s: %d EUR%n", mandje.getProductNaam(i), mandje.getProductPrijs(i));
        }

        System.out.printf("Het totaalbedrag is %d EUR.%n", mandje.getTotaalPrijs());

    }
}
