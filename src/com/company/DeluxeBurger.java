package com.company;

public class DeluxeBurger extends HamBurger {
    public DeluxeBurger() {
        super("Deluxe", "meat", "breadRollType", 14.54);
        super.addHamburgerAddition1("chips",2.75);
        super.addHamburgerAddition2("coke",1.81);

    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("not to  be done");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("not to  be done");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("not to  be done");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("not to  be done");
    }
}
