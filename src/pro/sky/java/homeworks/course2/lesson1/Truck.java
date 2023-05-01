package pro.sky.java.homeworks.course2.lesson1;

public class Truck extends MotorVehicle{
    public Truck(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkVehicle() {
        super.checkVehicle();
        checkTrailer();
    }
}
