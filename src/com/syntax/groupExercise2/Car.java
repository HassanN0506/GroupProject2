package com.syntax.groupExercise2;
/*
Create a Class Car that would have the following
fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price
of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class   has   field   as   weight   and   has   its   own
implementation   of
  calculateSalePrice()   method   in
which   returned   price   calculated   as   following:   if
weight>2000 then returned price car should include
10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it
is   own   implementation   of   calculateSalePrice():   if
length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
 */
public abstract class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    abstract double calculateSalePrice();
}

class Sedan extends Car{
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        return (length>20)? carPrice*0.95 : carPrice*0.9;
    }
}

class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        return (weight>2000)? carPrice*0.9 : carPrice*0.8;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car blueTruck = new Truck(40000, "Blue", 1000);
        System.out.println(blueTruck.calculateSalePrice());

        Car redSedan = new Sedan(30000, "Red", 15);
        System.out.println(redSedan.calculateSalePrice());
    }
}