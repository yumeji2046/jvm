package classloader;

/**
 * @author yumeji
 * @data 2019/11/26
 */
public class MyTest4 {
    public static void main(String[] args) {
        //MyParent4 myParent4 = new MyParent4();
        //MyParent4 myParent5 = new MyParent4();
        MyParent4[] myParent4s = new MyParent4[1];
        int[] a = new int[1];
        Integer[] b = new Integer[1];
        System.out.println(b.getClass());
        System.out.println(a.getClass());
        System.out.println(myParent4s.getClass());
    }
}

class MyParent4 {

    static {
        System.out.println("myparent4 block");
    }
}
