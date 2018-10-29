package bride.shape;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class RectangleShape extends Shape {

    @Override
    public void drawShape() {
        color.painting();
        System.out.println("draw rectangle...");
    }
}
