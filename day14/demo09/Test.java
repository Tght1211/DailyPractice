package day14.demo09;

//import day14.demo09.Outer.Inner;

public class Test {
    public static void main(String[] args) {
        MySub mb = new MySub(new Outer());
        mb.test();
/*        Outer o = new Outer();
        o.getInner().test();*/
    }
}

class Outer {
      abstract class Inner {
        public  abstract void test();

    }
}


class MySub extends Outer.Inner {
       MySub(Outer out) {
        out.super();
    }

    @Override
    public void test() {
        System.out.println("hello");
    }
}