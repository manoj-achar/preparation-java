package org.example.test;

import java.util.List;

public class TestCLass {

    static void main() {
        /*A obj1 = new C();
        A obj2 = new B();
        B obj3 = new C();
        A obj4 = new A();

        obj1.show();
        obj2.show();
        obj3.show();
        obj4.show();

        obj1.print();
        obj2.print();
        obj3.print();

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj3.getValue());

         */
        System.out.println("Returned = "+testReturnFinally());
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        list.stream()
                .filter(n -> {
                    System.out.println("filter " + n);
                    return n > 3;
                })
                .findFirst();

        System.out.println("done");

    }

    public static int testReturnFinally() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }
}

class A {
    void show() { System.out.println("A's show"); }

    static void print() { System.out.println("A's static print"); }

    Number getValue() { return 1; }
}

class B extends A {
    @Override
    void show() { System.out.println("B's show"); }

    static void print() { System.out.println("B's static print"); } // method hiding

    @Override
    Integer getValue() { return 2; } // covariant return
}

class C extends B {
    @Override
    void show() { System.out.println("C's show"); }

    static void print() { System.out.println("C's static print"); }

    @Override
    Integer getValue() { return 3; }
}

