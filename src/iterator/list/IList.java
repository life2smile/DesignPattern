package iterator.list;

import iterator.interator.IIterator;

/**
 * Created by wenzhi on 2018/10/24.
 */
public interface IList<T> {
    void add(T t);

    T get(int index);

    IIterator iterator();

    int getSize();
}
