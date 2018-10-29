package responsibility.chain;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Result {
    private Boolean success;

    public void setResult(Boolean result) {
        this.success = result;
    }

    public Boolean done() {
        return this.success;
    }
}
