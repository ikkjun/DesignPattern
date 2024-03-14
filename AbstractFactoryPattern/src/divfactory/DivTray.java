package divfactory;

import com.sun.org.apache.xpath.internal.operations.String;
import factory.Item;
import factory.Tray;

public class DivTray extends Tray {
    public DivTray(java.lang.String caption) {
        super(caption);
    }

    @Override
    public java.lang.String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<p><b>");
        sb.append(caption);
        sb.append("</b></p>\n");
        sb.append("<div class=\"TRAY\">");
        for (Item item: tray) {
            sb.append(item.makeHTML());
        }
        sb.append("</div>\n");
        return sb.toString();
    }
}
