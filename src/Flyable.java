public interface Flyable {

    String MODEL= "here";
    void fly();

    default void acrobatics(){
        System.out.println("yuhu" + MODEL);
    }
}
