package com.nickpappas;

public class Main {

    public static void main(String[] args) {

        // H ekfwnhsh einai sta agglika me apotelesma
        // na mhn einai apolita safes to ti 8elete na
        // kanoume...ekana oti kltb.

        Invoices invoices = new Invoices();
        Customer bob = new Customer("Bob",980720);

        invoices.addProduct(new Product(20.1,"Calculator"), 2);
        invoices.addProduct(new Product(54.45,"Shoes"), 1);
        invoices.addProduct(new Product(13.99,"Book"), 3);

        invoices.calculateAmmountDue(70);
        invoices.sendInvoices(bob.getBillingAddress());
    }
}
