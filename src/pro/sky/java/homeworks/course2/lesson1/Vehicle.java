package pro.sky.java.homeworks.course2.lesson1;

abstract class Vehicle implements Maintainable {
    private final int wheelsCount;
    private final String modelName;

    public Vehicle(int wheelsCount, String modelName) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        for (int i = 1; i < getWheelsCount()+1; i++) {
            System.out.println("Меняем покрышку "+i);
        }
    }

    @Override
    public void checkVehicle() {
        System.out.println("Обслуживание "+this.getModelName());
        updateTyre();
    }
}
