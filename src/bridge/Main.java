package bridge;

import bridge.color.GreenColor;
import bridge.color.IColor;
import bridge.color.RedColor;
import bridge.shape.CircleShape;
import bridge.shape.Shape;
import bridge.shape.RectangleShape;

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
