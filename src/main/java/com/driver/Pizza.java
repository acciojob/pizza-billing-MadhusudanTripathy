package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheeseCost;
    private int extraToppingsCost;
    private int extraTakewayCost;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill="";
        price=isVeg?300:400;
        extraCheeseCost=0;
        extraToppingsCost=0;
        extraTakewayCost=0;
        // your code goes here
    }
    public void makePizzaDelux(){
        price+=80;
        price+=isVeg?70:120;
    }
    public int getPrice(){
        if(isVeg){
            price=300;
        }else{
            price=400;
        }
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheeseCost+=80;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        extraToppingsCost+=isVeg?70:120;
        price+=isVeg?70:120;
    }

    public void addTakeaway(){
        // your code goes here
        extraTakewayCost+=20;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill+=(extraCheeseCost==0)?"":"Extra Cheese Added: "+extraCheeseCost+"\n";
        bill+=(extraToppingsCost==0)?"":"Extra Toppings Added: "+extraToppingsCost+"\n";
        bill+=(extraTakewayCost==0)?"":"Paperbag Added: "+extraTakewayCost+"\n";
        bill+="Total Price:"+String.valueOf(price);
        return this.bill;
    }
}
/*
Example 1:\
Base Price Of The Pizza: 300\
Extra Cheese Added: 80\
Extra Toppings Added: 70\
Paperbag Added: 20\
Total Price: 470

Example 2:\
Base Price Of The Pizza: 400\
Extra Cheese Added: 80\
Extra Toppings Added: 120\
Total Price: 600
*/