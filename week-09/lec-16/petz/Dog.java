package main.petz;

public class Dog extends Pet {

    public static void main(String[] args) {
        Dog p = new Dog("Shadow", 6);
        p.eat();
        p.getDroolLevel();
    }

    private int droolLevel;

    public Dog(String name, int droolLevel) {
        super(name);
        this.droolLevel = droolLevel;
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says 'Arf!'");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats a bone.");
    }

    public int getDroolLevel() {
        return droolLevel;
    }

}
