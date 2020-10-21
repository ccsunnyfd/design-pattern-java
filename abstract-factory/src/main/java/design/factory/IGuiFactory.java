package design.factory;

import design.model.button.IButton;
import design.model.checkbox.ICheckbox;

/**
 * Gui factory interface.
 * @version 1.0
 */
public interface IGuiFactory {

    IButton createButton();
    ICheckbox createCheckbox();
}
