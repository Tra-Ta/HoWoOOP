package HoWo3.Class;

public class Man {
    private String name;
    private HoWo3.Class.Cat cat;
    private HoWo3.Class.Dog dog;

    public Man(String name){
        this.name = name;
    }

    public void sayKsKs(){
        System.out.println(name + " говорит: Кис Кис Кис");
        cat.invite();
    }

    public void strokeCat(){
        cat.caress();
    }

    public void buyCat(Cat cat) {
        this.cat = cat;
    }

    public void buyDog(Dog dog) {
        this.dog = dog;
    }

    public void callTheDog(){
        System.out.println(name + " говорит: "+ dog.getName() +" комне");
        dog.invite();
    }
}