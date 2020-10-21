package design.model.checkbox;

/**
 * Html checkbox implementation
 *
 * @version 1.0
 */
public class HtmlCheckbox implements ICheckbox {
    @Override
    public void render() {
        System.out.println("<checkbox>Html Checkbox</checkbox>");
    }
}
