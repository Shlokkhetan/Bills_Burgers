package com.company;

public class HamBurger {
    private  String Name;
    private  String Meat;
    private String BreadRollType;
    private double Price;

    public HamBurger(String name, String meat, String breadRollType, double price) {
        Name = name;
        Meat = meat;
        BreadRollType = breadRollType;
        Price = price;
    }

//    private String addition1Name;
//    private double addition1Price;
//    private String addition2Name;
//    private double addition2Price;
//    private String addition3Name;
//    private double addition3Price;

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println(addition1Name + " has been added at  the price: " + addition1Price +" $");
        Price += addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println(addition2Name + " has been added at  the price: " + addition2Price +" $");
        Price += addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println(addition3Name + " has been added at  the price: " + addition3Price +" $");
        Price += addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println(addition4Name + " has been added at  the price: " + addition4Price +" $");
        Price += addition4Price;
    }

    public double itemizeHamburger(){
        System.out.println(" total burger price is : " + Price);
        return Price;
    }






}
