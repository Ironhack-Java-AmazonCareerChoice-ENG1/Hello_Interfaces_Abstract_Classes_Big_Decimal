public class Main {
    public static void main(String[] args) {

        Persistence filePersistence = new FilePersistence();
        Persistence cloudPersistence = new CloudPersistence();
        Computer computer = new Computer(cloudPersistence);

        Animal animal = new Bat("cave");




    }
}