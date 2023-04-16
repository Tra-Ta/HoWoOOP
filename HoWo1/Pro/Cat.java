package HoWo1.Pro;

public class Cat {
    private String name;
    private boolean hunger;

    public Cat(String name) {
        this.name = name;
        this.hunger = true;
    }

    protected void invite() {
        if (hunger) {
            System.out.println("мяу мяу мяу");
        }
    }

    public void stroke() {
        System.out.println("мурррррр");
    }
}
