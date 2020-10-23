package org.ccsunnyfd.design.product;

import lombok.Getter;
import org.ccsunnyfd.design.builder.IBuilder;
import org.ccsunnyfd.design.components.IComponent;

import java.util.List;

/**
 * Manual
 *
 * @version 1.0
 */
@Getter
public class Manual {
    private final Style style;
    private final List<IComponent> componentList;

    public Manual(IBuilder builder) {
        this.style = builder.getStyle();
        this.componentList = builder.getComponentList();
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("\nManual-------------------------" +
                "\n" +
                "风格： " + style +
                "\n\n" +
                "组件： \n");
        for(IComponent component: componentList) {
            detail.append(component).append("\n");
        }
        detail.append("-------------------------");
        return detail.toString();
    }
}
