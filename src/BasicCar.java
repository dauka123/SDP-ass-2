public class BasicCar implements Car {
    @Override
    public int cost(){
        return 1000;
    }
    @Override
    public String getDescription(){
        return "This is the simplest model of car";
    }
}
