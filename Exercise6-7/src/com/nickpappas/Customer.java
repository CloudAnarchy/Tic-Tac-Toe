package com.nickpappas;

public class Customer {

    private String name;
    private long billingAddress;

    public Customer(String name, long billingAddress){
        this.name = name;
        this.billingAddress = billingAddress;
    }

    public long getBillingAddress() {
        return billingAddress;
    }
}
