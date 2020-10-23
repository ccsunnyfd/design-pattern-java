package org.ccsunnyfd.design;

import org.ccsunnyfd.design.builder.CarBuilder;
import org.ccsunnyfd.design.builder.CarManualBuilder;
import org.ccsunnyfd.design.builder.IBuilder;
import org.ccsunnyfd.design.components.Engine;
import org.ccsunnyfd.design.components.Wheels;
import org.ccsunnyfd.design.director.Director;
import org.ccsunnyfd.design.product.Car;
import org.ccsunnyfd.design.product.Manual;
import org.ccsunnyfd.design.product.Style;

/**
 * Demo
 *
 * @version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car newCar = (Car)carBuilder.build();
        System.out.println(newCar);

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual newManual = (Manual)manualBuilder.build();
        System.out.println(newManual);

        CarManualBuilder manualBuilder2 = new CarManualBuilder();
        director.constructSUV(manualBuilder2);
        Manual newSUVManual = (Manual)manualBuilder2.build();
        System.out.println(newSUVManual);
    }

}

