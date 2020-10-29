package com.nibble.glazkov;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes", Color.BLACK, 120000, 130000);

        Car renault = new Car("Renault Logan", Color.BLACK, 120000, 130000);

        Car volvo = new Car("Volvo XC50", Color.GREEN, 120000, 130000);

        List<Car> cars = new ArrayList<>();

        cars.add(mercedes);
        cars.add(renault);
        cars.add(volvo);

        System.out.println(cars);
    /*
        System.out.println(cars);

        System.out.println(renault);
        System.out.println(mercedes);
        System.out.println(volvo);

        System.out.println(renault.equals(mercedes));

        renault.addPrice(123);
        renault.addPrice(123.5);

        System.out.println(renault);

        System.out.println(renault.equals(mercedes));
     */
    }
}
