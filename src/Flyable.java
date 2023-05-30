public interface Flyable {

    String model= "here";
    void fly();

    default void acrobatics(){
        System.out.println("yuhu");
    }
}
