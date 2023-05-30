public class Superman implements Flyable, Alert{
    @Override
    public void fly() {
        System.out.println("I fly because it's my superpower");
    }

    @Override
    public String createAlertMessage(String cause) {
        return "OMG, my nemesis is using " + cause + " against me!";
    }

    public void hello(){
        System.out.println("hello");
    }
}
