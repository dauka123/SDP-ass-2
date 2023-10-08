public class Medium extends CarDecorator {
    public Medium(Car car) {
        super(car);
    }
    @Override
    public int cost() {
        return car.cost() + 200;
    }
    @Override
    public String getDescription() {
        return "This model includes a push start";
    }
}
