package animal;

import edible.Edible;

public class chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken:cục tác....cục tác!!";
    }

    @Override
    public String howToEat() {
        return "Chicken can be baked";
    }
}