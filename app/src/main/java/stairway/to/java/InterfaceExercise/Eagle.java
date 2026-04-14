package stairway.to.java.InterfaceExercise;

public class Eagle implements FlyingAnimal{
    double wingsLength;

    public Eagle(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    public double getWingsLength() {
        return wingsLength;
    }

    public void setWingsLength(double wingsLength) {
        this.wingsLength = wingsLength;
    }

    @Override
    public void makeSound() {
        System.out.println("AAAAAAAAA");
    }

    @Override
    public void move() {
        System.out.println("The eagle is moving.");
    }

    @Override
    public String getFood() {
        return "Carnivore";
    }

    @Override
    public void fly() {
        System.out.println("The eagle is flying");
    }
    
}
