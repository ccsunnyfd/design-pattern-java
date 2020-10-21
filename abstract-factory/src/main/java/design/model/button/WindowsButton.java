package design.model.button;

/**
 * Windows Button implementation
 *
 * @version 1.0
 */
public class WindowsButton implements IButton {
    @Override
    public void render() {
        System.out.println("<button>Windows Button</button>");
    }
}
