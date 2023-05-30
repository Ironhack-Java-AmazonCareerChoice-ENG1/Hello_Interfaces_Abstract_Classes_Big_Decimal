public class FilePersistence implements Persistence{
    @Override
    public boolean save() {
        System.out.println("Storing in a text file");
        return true;
    }
}
