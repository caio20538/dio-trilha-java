package edu.caio.carro;

public class Car {
    private boolean stateCar;
    private int speedCar = 0;
    private int gear = 0;
    private String leftRight;

    public Car() {
    }

    public Car(int speedCar, int gear) {
        this.speedCar = speedCar;
        this.gear = gear;
        stateCar = false;
    }

    public int getSpeedCar() {
        return speedCar;
    }

    public int getGear() {
        return gear;
    }

    public String getLeftRight() {
        return leftRight;
    }

    public void setStateCar(Boolean stateCar) {
        this.stateCar = stateCar;
    }

    public void setSpeedCar(int speedCar) {
        this.speedCar = speedCar;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setLeftRight(String leftRight) {
        this.leftRight = leftRight;
    }

    public boolean getStateCar() {
        return stateCar;
    }
}
