package myClass;

/**
 * 反射测试
 */
public class Reflection {

    public static void main(String[] args) {

//        Class cla = void.class;
//        System.out.println(cla.getModifiers());
//
//        System.out.println(Integer.TYPE==int.class);

        Class cla = Dog.class;
        System.out.println(cla.getConstructors()[0].getName());
        System.out.println(cla.getDeclaredConstructors()[0]);
    }
}
