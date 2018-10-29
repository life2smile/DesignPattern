package responsibility.chain;

import responsibility.chain.processors.FirstProcessor;
import responsibility.chain.processors.SecondProcessor;
import responsibility.chain.processors.ThirdProcessor;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request("ThirdProcessor");
        FirstProcessor firstProcessor = new FirstProcessor(request);
        SecondProcessor secondProcessor = new SecondProcessor(request);
        ThirdProcessor thirdProcessor = new ThirdProcessor(request);

        firstProcessor.setNext(secondProcessor)
                .setNext(thirdProcessor);

        if (firstProcessor.handleRequest(request) == null) {
            System.out.println("request not be handled...");
        }
    }
}
