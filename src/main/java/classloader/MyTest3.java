package classloader;

import java.util.UUID;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent.string);
    }
}

class MyParent {
    public static final String string = UUID.randomUUID().toString();

    static {
        System.out.println("hello world");
    }
}
