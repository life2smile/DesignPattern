package singleinstance;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Created by wenzhi on 2018/10/30.
 */
public class Main {
    public static void main(String[] args) {
        SingleInstance instance1 = SingleInstance.instance();
        SingleInstance instance2 = SingleInstance.instance();

        System.out.println(instance1 == instance2);

        testSerializeInstance(instance1);

        testReflectInstance();
    }

    private static void testReflectInstance() {
        try {

            Class<SingleInstance> clazz = (Class<SingleInstance>) Class.forName("instance.SingleInstance");

            Constructor<SingleInstance> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            SingleInstance singleInstance3 = constructor.newInstance();
            SingleInstance singleInstance4 = constructor.newInstance();

            System.out.println(singleInstance3 == singleInstance4);
        } catch (Exception e) {
            System.out.println("reflection test exception: " + e.getCause().getMessage());
        }
    }

    private static void testSerializeInstance(SingleInstance originInstance) {
        try {
            FileOutputStream fos = new FileOutputStream("object.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(originInstance);
            oos.close();
            fos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.out"));
            SingleInstance in = (SingleInstance) ois.readObject();
            System.out.print("serializable test:");
            System.out.println(in == originInstance);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
