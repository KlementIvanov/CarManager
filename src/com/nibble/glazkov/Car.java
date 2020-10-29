package com.nibble.glazkov;

import java.util.Objects;

public class Car {

    String carName;
    Color color;
    int price;
    int run;

    public Car(String carName, Color color, int price, int run) {
        this.carName = carName;
        this.color = color;
        this.price = price;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", color=" + color +
                ", price=" + price +
                ", run=" + run +
                '}';
    }

    public void addPrice(int addPrice){
      this.price += addPrice;
    }
    public void addPrice(double addPrice){
        this.price += addPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                run == car.run &&
                carName.equals(car.carName) &&
                color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, color, price, run);
    }
}
