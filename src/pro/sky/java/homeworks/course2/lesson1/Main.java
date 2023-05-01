package pro.sky.java.homeworks.course2.lesson1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4,"car1");
        Car car2 = new Car(4,"car2");

        Truck truck = new Truck(6,"truck1");
        Truck truck2 = new Truck(8,"truck2");

        Bicycle bicycle = new Bicycle(2,"bicycle1");
        Bicycle bicycle2 = new Bicycle(2,"bicycle2");

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(bicycle2);
        station.check(car);
        station.check(car2);
        station.check(truck);
        station.check(truck2);
    }
}