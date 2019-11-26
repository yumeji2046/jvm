package classloader;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Parent.string);
    }
}

class Parent {
    public static final String string = "hello world";

    static {
        System.out.println("welcome");
    }
}
