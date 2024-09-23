public class Inheritance {
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        inheritance.inheritanceExample();
    }

    public void inheritanceExample() {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}


class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
