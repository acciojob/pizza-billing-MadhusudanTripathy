package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isToppings;
    private boolean isCheese;
    private boolean isTakeAway;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int basePrice;
    private int takeAwayPrice;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheese = false;
        this.isToppings = false;
        this.isTakeAway = false;
        this.extraCheesePrice = 80;
        this.takeAwayPrice = 20;

        this.isBillGenerated = false;
        // your code goes here
        if(isVeg){
            this.extraToppingsPrice = 70;
            this.price = 300;
        }
        else{
            this.extraToppingsPrice = 120;
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheese == false){
            this.price = this.price + this.extraCheesePrice;
            this.isCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppings == false){
            this.price = this.price + this.extraToppingsPrice;
            this.isToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isTakeAway){
            this.price = this.price + this.takeAwayPrice;
            this.isTakeAway = true;
        }
    }

    public String getBill() {
        // your code goes here
        if(!this.isBillGenerated){
            isBillGenerated = true;
            if (this.isCheese)
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            if (this.isToppings) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (this.isTakeAway)
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            this.bill = this.bill + "Total Price: " + this.price + "\n";
        }
        return this.bill;

    }
}
//public class Pizza {
//
//    private int price;
//    private Boolean isVeg;
//    private String bill;
//    private int extraCheeseCost;
//    private int extraToppingsCost;
//    private int extraTakewayCost;
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        bill="";
//        price=isVeg?300:400;
//        extraCheeseCost=0;
//        extraToppingsCost=0;
//        extraTakewayCost=0;
//        // your code goes here
//    }
//    public void makePizzaDelux(){
//        price+=80;
//        price+=isVeg?70:120;
//    }
//    public int getPrice(){
//        if(isVeg){
//            price=300;
//        }else{
//            price=400;
//        }
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//        extraCheeseCost+=80;
//        price+=80;
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//        extraToppingsCost+=isVeg?70:120;
//        price+=isVeg?70:120;
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        extraTakewayCost+=20;
//        price+=20;
//    }
//
//    public String getBill(){
//        // your code goes here
//        bill+=(extraCheeseCost==0)?"":"Extra Cheese Added: "+extraCheeseCost+"\n";
//        bill+=(extraToppingsCost==0)?"":"Extra Toppings Added: "+extraToppingsCost+"\n";
//        bill+=(extraTakewayCost==0)?"":"Paperbag Added: "+extraTakewayCost+"\n";
//        bill+="Total Price:"+String.valueOf(price);
//        return this.bill;
//    }
//}
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