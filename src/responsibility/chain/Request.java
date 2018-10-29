package responsibility.chain;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Request {
    private String mReq;

    public Request(String req) {
        this.mReq = req;
    }

    public String getRequest() {
        return mReq;
    }
}
