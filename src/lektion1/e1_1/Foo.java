package lektion1.e1_1;

public class Foo {
    final Object s;
    private int i = 3;

    private Foo(int i, String s) {
        this.i = i;
        this.s = s;
    }

    Foo(Foo f) {
        this.i = f.i;
        this.s = f.s;
    }

    static void x() {
        //  System.out.println(i);
    }

    int m() {
        String s = "Hallo";
        System.out.println(s);
        return 42;
    }

    int m(int a) {
        return i;
    }
}