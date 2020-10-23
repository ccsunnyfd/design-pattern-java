package org.ccsunnyfd.design.components;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Engine
 *
 * @version 1.0
 */
@Getter
@AllArgsConstructor
public class Engine implements IComponent {
    private final String series;
    private final String brand;

    @Override
    public String toString() {
        return "Engine: " + series + "系列\t" + brand;
    }
}
