package bridge.shape;

import bridge.color.IColor;

/**
 * Created by wenzhi on 2018/10/24.
 */
public abstract class Shape {
    IColor color;

    public abstract void drawShape();

    public void setColor(IColor color) {
        this.color = color;
    }
}
