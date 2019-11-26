package classloader;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class Mytest1 {
    public static void main(String[] args) {
        //System.out.println(Child.string1);
        System.out.println(Child.string2);
    }
}

class Parrent {
    public static String string1 = "hello world";

    static {
        System.out.println("my parent block");
    }
}

class Child extends Parrent {
    public static final String string2 = "welcome";

    static {
        System.out.println("child block");
    }
}
