package HoWo2.Class;

public class Start {
        public static void main(String[] args) {
            Man max = new Man("Maks");
            MaineCoon bars = new MaineCoon("Барсик");

            Man tom = new Man("Том");
            Siamese musy = new Siamese("Муся");
            Husky haska = new Husky("Дружок");


            max.buyCat(bars);
            max.sayKsKs();
            max.strokeCat();

            tom.buyCat(musy);
            tom.sayKsKs();
            tom.strokeCat();

            tom.buyDog(haska);
            tom.callTheDog();
        }
    }

