package bride.shap;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class CircleShape extends Shape {

    @Override
    public void drawShape() {
        color.painting();
        System.out.println("draw circle ");
    }
}
