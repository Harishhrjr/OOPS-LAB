class Animal {
    protected String species;
    protected int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Bird extends Animal {
    private double wingSpan;

    public Bird(String species, int age, double wingSpan) {
        super(species, age);
        this.wingSpan = wingSpan;
    }

  
    public void makeSound() {
        System.out.println("Bird chirps.");
    }
}

class Fish extends Animal {
    private String waterType;

    public Fish(String species, int age, String waterType) {
        super(species, age);
        this.waterType = waterType;
    }


    public void makeSound() {
        System.out.println("Fish makes a bubbling sound.");
    }
}

public class AnimalClassificationSystem {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", 2, 1.5);
        Fish fish = new Fish("Goldfish", 1, "Freshwater");
        bird.makeSound();
        fish.makeSound();
    }
}