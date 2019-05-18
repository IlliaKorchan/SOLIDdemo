package interfacesegregation.demo;

public class InterfaceSegregation {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waiter waiter = new Waiter();

        cook.work();
        cook.eat();
        waiter.work();
    }
}

interface Eater {
    void eat();
}

interface Worker {
    void work();
}

interface Employee extends Worker, Eater {
    @Override
    public void eat();

    @Override
    public void work();
}

class Cook implements Employee {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void work() {
        System.out.println("work");
    }
}

class Waiter implements Worker {
    @Override
    public void work() {
        System.out.println("work");
    }
}