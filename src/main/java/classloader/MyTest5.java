package classloader;

import java.util.UUID;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    String d = "123456";

}

interface MyChild5 extends MyParent5 {
    String b = UUID.randomUUID().toString();
}
