package mateacademy.homework.homework_6;

public class Car implements Cloneable {

    private String mark;
    private int maxSpeed;
    privat AdditionalEquipment addEquipment;

    @Override
    protected Object clone() {
        Car car = null;
        try {
            car = (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Car(this.getMark(),
                    this.getMaxSpeed(),
                    this.getAddEquipment());
        }
        car.addEquipment = (AdditionalEquipment) this.addEquipment.clone();
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark = "+ mark +
                ", maxSpeed = " + maxSpeed +
                ", addEquipment=" + addEquipment +
                '}';
    }

    public Car(String mark, int maxSpeed, AdditionalEquipment addEquipment) {
        this.mark = mark;
        this.maxSpeed = maxSpeed;
        this.addEquipment = addEquipment;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public AdditionalEquipment getAddEquipment() {
        return addEquipment;
    }

    public void setAddEquipment(AdditionalEquipment addEquipment) {
        this.addEquipment = addEquipment;
    }
}
