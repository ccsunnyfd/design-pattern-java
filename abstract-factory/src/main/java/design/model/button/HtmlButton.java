package design.model.button;

/**
 * Html Button implementation
 *
 * @version 1.0
 */
public class HtmlButton implements IButton {
    @Override
    public void render() {
        System.out.println("<button>Html Button</button>");
    }
}
