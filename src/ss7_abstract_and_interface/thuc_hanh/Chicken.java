package ss7_abstract_and_interface.thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
