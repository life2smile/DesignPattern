package factory.simple.operation;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class SubOperation extends Operation {
    @Override
    public double result() {
        return num1 - num2;
    }
}
