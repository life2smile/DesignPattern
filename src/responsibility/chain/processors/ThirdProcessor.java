package responsibility.chain.processors;

import responsibility.chain.Request;
import responsibility.chain.Result;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class ThirdProcessor extends AbstractProcessor {
    public ThirdProcessor(Request request) {
        super(request);
    }

    @Override
    public Result process(Request request) {
        if ("ThirdProcessor".equals(request.getRequest())) {
            System.out.println("third processor handled...");
            Result result = new Result();
            result.setResult(true);
            return result;
        }
        return null;
    }
}
