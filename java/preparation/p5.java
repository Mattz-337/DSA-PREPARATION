interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}

class P5{
    public static void main(String[] args){
        Dog d = new Dog();
        d.makeSound();
    }
}