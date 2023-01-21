package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
//    p.addTakeaway();
    System.out.println(p.getBill());
  }

}
//450
//Base Price Of The Pizza: 300
//Extra Cheese Added: 80
//Extra Toppings Added: 70
//Paperbag Added: 20
//Total Price: 470
//
//Base Price Of The Pizza: 300
//Extra Cheese Added: 80
//Extra Toppings Added: 70
//Paperbag Added: 20
//Total Price: 470