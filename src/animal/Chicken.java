package animal;

import interFace.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken : Cuc cu";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
