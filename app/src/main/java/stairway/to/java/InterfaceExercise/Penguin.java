package stairway.to.java.InterfaceExercise;

public class Penguin implements AquaticAnimal{

    double idealRoomTemperature;

    public Penguin(double idealRoomTemperature) {
        this.idealRoomTemperature = idealRoomTemperature;
    }

    public double getIdealRoomTemperature() {
        return idealRoomTemperature;
    }

    public void setIdealRoomTemperature(double idealRoomTemperature) {
        this.idealRoomTemperature = idealRoomTemperature;
    }

    @Override
    public void makeSound() {
        System.out.println("Noot Noot.");
    }

    @Override
    public void move() {
        System.out.println("The penguin is walking slowly.");
    }

    @Override
    public String getFood() {
        return "Fish";
    }

    @Override
    public void swim() {
        System.out.println("The penguin is swimming.");
    }
    
}
