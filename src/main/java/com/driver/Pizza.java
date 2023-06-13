package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheese;
    private boolean top;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price+=300;
            this.bill="Base Price Of The Pizza: 300\n";
        }
        else{
            this.price+=400;
            this.bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.cheese) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            this.cheese=true;
        }
    }

    public void addExtraToppings(){
        if(!this.top) {
            if (this.isVeg) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";

            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";

            }
            this.top=true;
        }
    }

    public void addTakeaway(){
        this.price+=20;
        this.bill+="Paperbag Added: 20\n";
    }

    public String getBill(){
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
