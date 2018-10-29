package iterator.interator;

/**
 * Created by wenzhi on 2018/10/24.
 */
public interface IIterator<T> {
    boolean hasNext();

    T next();
}
