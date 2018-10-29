package iterator;

import iterator.interator.IIterator;
import iterator.list.IList;
import iterator.list.MyList;

/**
 * Created by wenzhi on 2018/10/24.
 */
public class Main {
    public static void main(String[] args) {
        IList<String> list = new MyList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");

        IIterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        IList<Integer> list2 = new MyList<>();
        list2.add(1);
        list2.add(2);
        IIterator iterator1 = list2.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
