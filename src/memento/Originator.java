package memento;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class Originator {
    private String mState;

    public String getState() {
        return this.mState;
    }

    public void setState(String state) {
        this.mState = state;
    }

    public Memento createMemento() {
        return new Memento(this.mState);
    }
}
