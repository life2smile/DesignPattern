package bride;

import bride.color.GreenColor;
import bride.color.IColor;
import bride.color.RedColor;
import bride.shap.CircleShape;
import bride.shap.Shape;
import bride.shap.RectangleShape;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Main {
    public static void main(String[] args) {
        IColor color = new RedColor();
        Shape shape = new RectangleShape();
        shape.setColor(color);
        shape.drawShape();

        shape = new CircleShape();
        color = new GreenColor();
        shape.setColor(color);
        shape.drawShape();
    }
}
