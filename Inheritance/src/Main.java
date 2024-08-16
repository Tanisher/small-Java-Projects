public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","huge", 400);
        doAnimalStuff(animal, "Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"Fast");

        Dog retriever = new Dog("retriever",65,"floppy","swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("gold fish",0.25,2,3);
        doAnimalStuff(goldie,"fast");

    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.noise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
