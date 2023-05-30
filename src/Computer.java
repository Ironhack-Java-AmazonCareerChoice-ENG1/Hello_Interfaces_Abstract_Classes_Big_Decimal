import java.util.List;

public class Computer {

    private final Persistence persistenceSystem;

    public Computer(Persistence persistenceSystem) {
        this.persistenceSystem = persistenceSystem;
    }

    public void processInformation(List<String> data){
        for (String info : data){
            System.out.println(info);
        }
        persistenceSystem.save();
    }
}
