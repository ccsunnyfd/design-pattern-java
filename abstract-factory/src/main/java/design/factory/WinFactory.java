package design.factory;

import design.model.button.IButton;
import design.model.button.WindowsButton;
import design.model.checkbox.ICheckbox;
import design.model.checkbox.WindowsCheckbox;

/**
 * Windows Factory will produce Windows components
 *
 * @version 1.0
 */
public class WinFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
