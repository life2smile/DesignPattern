package memento;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class Memento {
    private String mState;

    public Memento(String state) {
        this.mState = state;
    }

    public String getState() {
        return this.mState;
    }
}
