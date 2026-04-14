package stairway.to.java.InterfaceExercise;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion(200);
        Penguin penguin = new Penguin(0);
        Eagle eagle = new Eagle(1.8);

        Animal[] animals = {lion, penguin, eagle};

        Zoo zoologico = new Zoo(animals);

        zoologico.listAnimals();
        
    }
}
