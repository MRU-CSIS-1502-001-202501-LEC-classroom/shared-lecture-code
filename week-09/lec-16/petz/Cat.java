package main.petz;

public class Cat extends Pet {

    public static void main(String[] args) {
        Cat merry = new Cat("Merry");
        merry.speak();
        merry.eat();
    }

    public Cat(String name) {
        super(name);
    }

    public void speak() {
        System.out.println(getName() + " says 'Nyaaa!'");
    }

    public void eat() {
        System.out.println(getName() + " eats a mouse.");
    }

}
