package io.welldev;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainApp {
    public static void main(String[] args) throws Exception{
        Class cls = TestExample.class;
        System.out.println(cls.getName());

        Constructor[] constructor = cls.getConstructors();

        for (Constructor c : constructor) {
            System.out.println(c.getName());
        }

        Method[] methods = cls.getMethods();

        for (Method m : methods) {
           System.out.println(m.getName());
        }

        Method methodcall1 = cls.getDeclaredMethod("method1", null);
        TestExample te = new TestExample();
        methodcall1.invoke(te);

        Field field = cls.getDeclaredField("s");
        field.setAccessible(true);
        field.set(te, "Roger Roger!");
        methodcall1.invoke(te);

        Method methodcall3 = cls.getDeclaredMethod("method3");
        methodcall3.setAccessible(true);
        methodcall3.invoke(te);

        Class<?>[] parameters = methods[0].getParameterTypes();

        for (Class<?> p : parameters) {
            System.out.println(p.getName());
        }


    }
}
