public class Main {
    public static void main(String[] args) {
         Car car = new BasicCar();
         System.out.println("Basic car - " + car.cost() + "\n" + car.getDescription());
         System.out.println();

         Car mediumconfiguration = new Medium(car);
         System.out.println("Medium configuration car - " + mediumconfiguration.cost() + "\n" + mediumconfiguration.getDescription());
         System.out.println();

         Car fullconfiguration = new Full(car);
         System.out.println("Full configuration - " + fullconfiguration.cost() + "\n" + fullconfiguration.getDescription());
         System.out.println();
     }
}

