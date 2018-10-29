package iterator.list;

import iterator.interator.ConcreteIterator;
import iterator.interator.IIterator;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class MyList<T> implements IList<T> {
    private T[] mMembers = (T[]) new Object[100];
    private int mCurIndex = 0;

    @Override
    public void add(T t) {
        mMembers[mCurIndex++] = t;
    }

    @Override
    public T get(int index) {
        return mMembers[index];
    }

    @Override
    public IIterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return mCurIndex;
    }
}
