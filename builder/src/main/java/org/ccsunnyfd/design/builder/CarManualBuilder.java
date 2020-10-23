package org.ccsunnyfd.design.builder;

import org.ccsunnyfd.design.components.IComponent;
import org.ccsunnyfd.design.product.Manual;
import org.ccsunnyfd.design.product.Style;

import java.util.ArrayList;
import java.util.List;

/**
 * CarManualBuilder
 *
 * @version 1.0
 */
public class CarManualBuilder implements IBuilder {
    private final Style DEFAULT_STYLE = Style.CITY;

    private Style style;
    private List<IComponent> componentList = new ArrayList<>();

    @Override
    public Object build() {
        if (style == null) {
            this.style = DEFAULT_STYLE;
        }
        return new Manual(this);
    }

    @Override
    public IBuilder setStyle(Style style) {
        this.style = style;
        return this;
    }

    @Override
    public IBuilder addComponent(IComponent component) {
        this.componentList.add(component);
        return this;
    }

    @Override
    public Style getStyle() {
        return style;
    }

    @Override
    public List<IComponent> getComponentList() {
        return componentList;
    }
}
