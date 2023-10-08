public abstract class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    /*@Override
    public int cost() {
        return car.cost();
    }*/
}