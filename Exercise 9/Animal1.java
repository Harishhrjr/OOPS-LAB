interface Animal {
    String makeSound();
    String getType();
}

class Dog implements Animal {
    public String makeSound() {
        return "Bark";
    }
    
    public String getType() {
        return "Dog";
    }
}

class Cat implements Animal {
    public String makeSound() {
        return "Meow";
    }
    
    public String getType() {
        return "Cat";
    }
}

public class Animal1 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        System.out.println(dog.getType() + " makes sound: " + dog.makeSound());
        System.out.println(cat.getType() + " makes sound: " + cat.makeSound());
    }
}