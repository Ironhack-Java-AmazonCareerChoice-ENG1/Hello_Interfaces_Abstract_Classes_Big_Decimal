public class Human extends Animal{

    public Human(String habitat) {
        super(habitat);
    }

    @Override
    public void sleep() {
        System.out.println("I love to sleep on a futon");
    }

    @Override
    public void eat() {

    }
}
