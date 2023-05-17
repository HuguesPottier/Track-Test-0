package basic.codelab01;

public class Main {

    private final static AnimalService animalService = new AnimalService(new AnimalRepository());
    private final static CarService carService = new CarService(new CarRepository());
    private final static SportService sportService = new SportService(new SportRepository());

    public static void main(String[] args) {
        Animal animal = animalService.getAnimalByName("Felix");
        animal.letDayPass();
        System.out.println(animal);
        animal.feed();
        System.out.println(animal);

        Car car = carService.getCarByType("Sports Car");
        car.turnOn();
        car.pressBreak();

        Sport sport = sportService.getSportByName("Tennis");
        sport.play();
    }
}
