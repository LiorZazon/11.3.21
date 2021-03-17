package com.company;

public class Tenant implements IRentPayer{

    @Override
    public void payArnona() {
        System.out.println("i pay arnona");
    }

    @Override
    public void payRent() {
        System.out.println("i pay rent");

    }
}
