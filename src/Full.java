public class Full extends CarDecorator {
    public Full(Car car) {
        super(car);
    }
    @Override
    public int cost() {
        return car.cost() + 400;
    }
    @Override
    public String getDescription() {
        return "This is the latest model which has all the useful features";
    }
}
