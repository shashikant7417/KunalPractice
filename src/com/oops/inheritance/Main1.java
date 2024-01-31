package com.oops.inheritance;

public class Main1 {

    public static void main(String[] args) {
        A a = new A(1, 2);
        B b = new B(1, 2, 3, 4);
        C c = new C(1, 2, 3, 4, 5, 6);
        

    }


}

class A {

    int l;
    int b;

    public A(int l, int b) {
        super();
        this.l = l;
        this.b = b;
    }
}

class B extends A {

    int a;
    int b;

    public B(int l, int b, int a, int k) {
        super(l, b);
        this.a = a;
        this.b = b;
    }
}

class C extends B {

    int c;
    int d;

    public C(int l, int b, int a, int b1, int c, int d) {
        super(l, b, a, b);
        this.c = c;
        this.d = d;
    }
}
