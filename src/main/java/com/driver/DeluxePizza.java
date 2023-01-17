package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
//        super.addExtraCheese();
//        super.addExtraToppings();
        super.makePizzaDelux();
        // your code goes here
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void addExtraCheese() {
        super.addExtraCheese();
    }

    @Override
    public void addExtraToppings() {
        super.addExtraToppings();
    }

    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }

    @Override
    public String getBill() {
        return super.getBill();
    }
}
