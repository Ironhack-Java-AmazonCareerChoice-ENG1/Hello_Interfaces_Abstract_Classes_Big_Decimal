public class Main {
    public static void main(String[] args) {

        Persistence filePersistence = new FilePersistence();
        Persistence cloudPersistence = new CloudPersistence();
        Computer computer = new Computer(cloudPersistence);

        Animal animal = new Human("cave");

        if(animal instanceof Bat) {
            ((Bat) animal).fightJoker();
        }




    }
}