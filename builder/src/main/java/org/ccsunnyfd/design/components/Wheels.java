package org.ccsunnyfd.design.components;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Wheels
 *
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public class Wheels implements IComponent {
    private final int number;
    private final String brand;

    @Override
    public String toString() {
        return "wheels: " + number + "个\t" + brand;
    }
}
