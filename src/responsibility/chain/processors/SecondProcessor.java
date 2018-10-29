package responsibility.chain.processors;

import responsibility.chain.Request;
import responsibility.chain.Result;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class SecondProcessor extends AbstractProcessor {
    public SecondProcessor(Request request) {
        super(request);
    }

    @Override
    public Result process(Request request) {
        if ("SecondProcessor".equals(request.getRequest())) {
            System.out.println("second processor handled...");
            Result result = new Result();
            result.setResult(true);
            return result;
        }
        return null;
    }
}
