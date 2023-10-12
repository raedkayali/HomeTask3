public abstract class Vehicle {
    Manufacture manufacture;
    Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void showCharacteristics();
}
