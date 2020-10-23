package org.ccsunnyfd.design.builder;

import org.ccsunnyfd.design.product.Style;
import org.ccsunnyfd.design.components.IComponent;

import java.util.List;

/**
 * IBuilder
 *
 * @version 1.0
 */
public interface IBuilder {
    IBuilder setStyle(Style style);
    IBuilder addComponent(IComponent component);

    Object build();

    Style getStyle();
    List<IComponent> getComponentList();
}
