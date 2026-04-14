package stairway.to.java.InterfaceExercise;

class Lion implements Animal{

    private double weight;

    public Lion(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeSound() {
        System.out.println("Roar.");
    }

    @Override
    public void move() {
        System.out.println("The lion is moving through the jungle.");
    }

    @Override
    public String getFood() {
        return "Carnivore";
    }
    
}
