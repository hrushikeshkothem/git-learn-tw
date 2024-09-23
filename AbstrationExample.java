public class AbstrationExample {
    public static void main(String[] args) {
        Abstraction abstraction = new AbstractionImpl();
        abstraction.abstractMethod();
        abstraction.nonAbstractMethod();

        Abstraction abstraction2 = new AbstractionImpl2();
        abstraction2.abstractMethod();
        abstraction2.nonAbstractMethod();
    }
}

class AbstractionImpl extends Abstraction {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method");
    }
}

class AbstractionImpl2 extends Abstraction {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method 2");
    }
}

abstract class Abstraction {
    public void nonAbstractMethod() {
        System.out.println("Non Abstract Method");
    }

    public abstract void abstractMethod();
}