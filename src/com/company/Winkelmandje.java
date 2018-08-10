package com.company;


public class Winkelmandje {


    private String[] producten = new String[3];

    private int[] productprijzen = new int[3];

    private int teller = 0;


    public void addProduct(String naam, int prijs) {

        producten[teller] = naam;

        productprijzen[teller] = prijs;


        teller++;

    }

    public int getAantalProducten() {
        return teller;
    }

    public String getProductNaam(int i) {

        return producten[i];
    }

    public int getProductPrijs(int i) {
        return productprijzen[i];

    }

    public int getTotaalPrijs() {

        return productprijzen[0] + productprijzen[1] + productprijzen[2];
    }
}
