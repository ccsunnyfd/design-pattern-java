package org.ccsunnyfd.design.director;

import org.ccsunnyfd.design.builder.IBuilder;
import org.ccsunnyfd.design.components.Engine;
import org.ccsunnyfd.design.components.Wheels;
import org.ccsunnyfd.design.product.Style;

/**
 * Director 主管不应该知道生成的是什么具体产品，他只管定产品最终的款式风格，让生成器做具体的拼装，所以不需要返回。
 * 生成器builder是具体知道要怎么拼装，拼装哪几类零件，生成了什么具体产品的，
 * 调用它的build()方法可以拿到生成的具体产品，可能是Car也可能是Manual
 *
 * @version 1.0
 */
public class Director {
    public void constructSportsCar(IBuilder builder) {
        builder.setStyle(Style.SPORTS)
                .addComponent(new Engine("W911", "lofo"))
                .addComponent(new Wheels(4, "horse"));
    }

    public void constructSUV(IBuilder builder) {
        builder.setStyle(Style.SUV)
                .addComponent(new Engine("W854", "taco"))
                .addComponent(new Wheels(5, "dancer"));
    }
}
