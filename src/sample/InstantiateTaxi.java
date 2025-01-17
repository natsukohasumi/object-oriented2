package sample;

public class InstantiateTaxi {
    public static void main(String[] args) {

        Taxi taxi = new Taxi();

        taxi.speed = 0;
        taxi.name = "タクシー使用のプリウス";

        taxi.stepOnAccele();
        taxi.stepOnAccele();
        taxi.stepOnBreak();

        System.out.println("現在の速度は" + taxi.speed + "km/hです");
    }
}
