package view;

/**
 *
 * @author HUNGVUONG
 */
public class MessHTML {

    private final String name;
    private final String message;
    private final String align;
    private final String bgColor;
    private final String textColor;

    public MessHTML(String name, String message, String align, String bgColor, String textColor) {
        this.name = name;
        this.message = message;
        this.align = align;
        this.bgColor = bgColor;
        this.textColor = textColor;
    }

    @Override
    public String toString() {
        return "<html>\n"
                + "<b>" + name + "</b>"
                + "<div style=\"text-align:" + align + "; background-color: #" + bgColor + "; color: " + textColor + "; padding: 5px; max-width:300px; font-family:Segoe UI;font-size:11px\">\n"
                + "<span>" + message + "</span>\n"
                + "</div>\n"
                + "</html>";
    }

}