package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class CareTaker {
    private List<Memento> mList = new ArrayList<>();

    public void saveToMemento(Memento memento) {
        this.mList.add(memento);
    }

    public Memento restoreFromMemento(int step) {
        return this.mList.get(step);
    }
}
