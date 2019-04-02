import Fruit.Fruit;
import animal.Animal;
import animal.chicken;
import animal.tiger;
import edible.Edible;
import Fruit.Orange;
import Fruit.apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new tiger();
        animals[1] = new chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof chicken) {
                Edible edible = (chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
