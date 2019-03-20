package com.nickpappas;

import java.util.ArrayList;

public class Invoices {

    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Integer> n_product = new ArrayList<Integer>();
    private double ammountReceived;
    private double ammountdue;


    public void addProduct(Product product,int n) {
        products.add(product);
        n_product.add(n);
    }

    private double getAmmountdue(){

        for(int i=0;i<products.size();i++){
            Product prod = products.get(i);
            ammountdue+=prod.getPrice() * n_product.get(i);
        }
        return ammountdue;
    }

    public double calculateAmmountDue(double ammountReceived){
        double ammountDue  = getAmmountdue();
        ammountDue -= ammountReceived;
        if(ammountDue != 0) System.out.println("You still have to pay: "+ammountDue);
        return ammountDue;
    }

    public void sendInvoices(long billingAdress){
        System.out.println("I sent the invoceis to: "+billingAdress);
    }
}
