class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Mammal extends Animal {
    protected boolean isDomestic;

    public Mammal(String name, int age, boolean isDomestic) {
        super(name, age);
        this.isDomestic = isDomestic;
    }

   
    public void makeSound() {
        System.out.println("Mammal makes a sound.");
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, boolean isDomestic, String breed) {
        super(name, age, isDomestic);
        this.breed = breed;
    }

    
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class AnimalClassificationSystem {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, true, "Golden Retriever");
        dog.makeSound();
    }
}
