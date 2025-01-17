package sample;

public class Car {
    protected int speed;
    protected String name;

    

    

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Car(){

    }

    public Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    public void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");

    }

    public void stepOnBreak(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");

    }
}
