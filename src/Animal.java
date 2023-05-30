import org.w3c.dom.ls.LSOutput;

public abstract class Animal {
    protected final String habitat;

    protected Animal(String habitat) {
        this.habitat = habitat;
    }

    public void sleep(){
        System.out.println("zzz");
    }

    public abstract void eat();

    public void getInfo(){
        System.out.println("Habitat: " + habitat);
    }
}
