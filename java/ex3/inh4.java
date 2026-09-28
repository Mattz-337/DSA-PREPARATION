class Animal {
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Mammal extends Animal {
    void makeSound(){
        System.out.println("Mammal makes sound");
    }
}

class Dog extends Mammal {
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class inh4 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
 
}