package pro.sky.java.homeworks.course2.lesson1;

public class MotorVehicle extends Vehicle{
    public MotorVehicle(int wheelsCount, String modelName) {
        super(wheelsCount, modelName);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkVehicle() {
        super.checkVehicle();
        checkEngine();
    }
}
