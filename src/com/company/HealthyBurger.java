package com.company;

public class HealthyBurger extends HamBurger {
    private String HealthyExtra1Name;
    private double HealthyExtra1Price;
    private String HealthyExtra2Name;
    private double HealthyExtra2Price;

    public HealthyBurger(String meat,  double price) {
        super("healthy", meat, "rye", price);

    }

    public void addHealthyAddition1(String addition1Name, double addition1Price){
        System.out.println(addition1Name + "has been added at  the price: " + addition1Price +" $");
        this.HealthyExtra1Price = addition1Price;
    }

    public void addHealthyAddition2(String addition2Name, double addition2Price) {
        System.out.println(addition2Name + "has been added at  the price: " + addition2Price + " $");
        this.HealthyExtra2Price += addition2Price;

    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.HealthyExtra1Name != null) {
            totalPrice += HealthyExtra1Price;
            System.out.println("Added " + this.HealthyExtra1Name + " for an extra " + this.HealthyExtra1Price);
        }
        if (this.HealthyExtra2Name != null) {
            totalPrice += HealthyExtra2Price;
            System.out.println("Added " + this.HealthyExtra2Name + " for an extra " + this.HealthyExtra2Price);
        }
        return totalPrice;
    }
}
