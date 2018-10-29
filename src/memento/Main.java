package memento;

/**
 * Created by wenzhi on 2018/10/29.
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("000");
        originator.setState("001");
        careTaker.saveToMemento(originator.createMemento());

        originator.setState("002");
        careTaker.saveToMemento(originator.createMemento());

        originator.setState("003");
        careTaker.saveToMemento(originator.createMemento());

        System.out.println("current state: " + originator.getState());

        System.out.println("restore 001 state: now state is " + careTaker.restoreFromMemento(0).getState());
        System.out.println("restore 002 state: now state is " + careTaker.restoreFromMemento(1).getState());

    }
}
