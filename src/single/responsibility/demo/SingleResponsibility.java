package single.responsibility.demo;

public class SingleResponsibility {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();

        employeeFacade.cook();
        employeeFacade.cleanFloor();
    }
}

interface Employee {
    int getSalary();
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();

    public void cook() {
        cook.cook();
    }

    public void cleanFloor() {
        janitor.cleanFloor();
    }
}

class Cook implements Employee {
    @Override
    public int getSalary() {
        return 150;
    }

    public void cook() {
        System.out.println("Cooking.");
    }
}



class Janitor implements Employee {
    @Override
    public int getSalary() {
        return 100;
    }

    public void cleanFloor() {
        System.out.println("Cleaning.");
    }
}

