package chap1;

public class Car {

    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }



    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run(){
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model+"가 달립니다.");
        }
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
