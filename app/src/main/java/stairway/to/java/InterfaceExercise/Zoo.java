package stairway.to.java.InterfaceExercise;

public class Zoo {
    private Animal[] animals = new Animal[3];

    public Zoo(Animal[] animals) {
        this.animals = animals;
    }

    void listAnimals(){
        for (Animal animal : animals) {
            animal.makeSound();
            animal.move();
            System.out.println(animal.getFood());
            System.out.println();
        }
    };
}
