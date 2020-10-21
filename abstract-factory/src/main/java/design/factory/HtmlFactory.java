package design.factory;

import design.model.button.HtmlButton;
import design.model.button.IButton;
import design.model.checkbox.HtmlCheckbox;
import design.model.checkbox.ICheckbox;

/**
 * Html Factory will produce html components
 *
 * @version 1.0
 */
public class HtmlFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new HtmlButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new HtmlCheckbox();
    }
}
