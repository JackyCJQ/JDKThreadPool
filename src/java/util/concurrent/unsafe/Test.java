package java.util.concurrent.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by Jacky on 2019/3/25.
 */
public class Test {
    public static void main(String[] args) throws NoSuchFieldException {
        try {
            Field unsafe = Unsafe.class.getDeclaredField("theUnsafe");
            unsafe.setAccessible(true);
            Unsafe un = (Unsafe) unsafe.get(null);
            System.out.println(un);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
