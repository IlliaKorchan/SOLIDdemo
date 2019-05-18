package open.closed.demo;

public class OpenClosed {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();

        toyota.workInTaxi();
    }
}

interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    void getPassenger() {
        System.out.println("Get passengers");
    }
}

class Celica extends Toyota {
    void getPassenger() {
        System.out.println("Get one passenger");
    }

    @Override
    public void workInTaxi() {
        getPassenger();
    }
}


