package iterator.interator;

import iterator.list.IList;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class ConcreteIterator<T> implements IIterator<T> {
    private IList<T> mList;
    private int index;

    public ConcreteIterator(IList list) {
        this.mList = list;
    }

    @Override
    public boolean hasNext() {
        return index < mList.getSize();
    }

    @Override
    public T next() {
        if (mList != null) {
            T t = mList.get(index);
            index++;
            return t;
        }
        return null;
    }
}
