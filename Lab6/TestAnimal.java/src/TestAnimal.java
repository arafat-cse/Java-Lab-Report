public class TestAnimal {
    public static void main(String[] args) {
        Animal animal;
        animal = new Dog();
        animal.makeSound(); 
        animal = new Cat();
        animal.makeSound(); 
        animal = new Cow();
        animal.makeSound(); 
    }
}
