package responsibility.chain.processors;

import responsibility.chain.Request;
import responsibility.chain.Result;

/**
 * Created by wenzhi on 2018/10/24.
 */
public abstract class AbstractProcessor {
    protected Request mRequest;
    private AbstractProcessor nextProcessor;

    public AbstractProcessor(Request request) {
        this.mRequest = request;
    }

    public AbstractProcessor setNext(AbstractProcessor processor) {
        this.nextProcessor = processor;
        return processor;
    }

    public Result handleRequest(Request request) {
        Result result = process(request);
        if (result != null && result.done()) {
            return result;
        }

        if (nextProcessor != null) {
            return nextProcessor.handleRequest(request);
        }

        return null;
    }

    abstract Result process(Request request);
}
