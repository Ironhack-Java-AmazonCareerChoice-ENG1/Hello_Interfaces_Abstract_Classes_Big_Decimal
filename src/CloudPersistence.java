public class CloudPersistence implements Persistence{
    @Override
    public boolean save() {
        System.out.println("storing data on the cloud");
        return true;
    }
}
