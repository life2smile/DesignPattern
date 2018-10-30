package factory.simple;

import factory.simple.operation.AddOperation;
import factory.simple.operation.Operation;
import factory.simple.operation.SubOperation;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        switch (operation) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubOperation();
            default:
                throw new RuntimeException("operation not support");

        }
    }
}
