package dependency.inversion.demo;

public class DependencyInversion {
    public static void main(String[] args) {
        Client client = new Client();

        client.doJob();
    }
}

interface DAO {
    void execute();
}

class DataAccess implements DAO {
    @Override
    public void execute() {
        System.out.println("execute");
    }
}

class Client {
    DAO dataAccess = new DataAccess();

    void doJob() {
        dataAccess.execute();
    }
}
