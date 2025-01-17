package practice;

public class Clock {
    protected String time;

    Clock(String time){
        this.time = time;
    }

    public void showTime(){
        System.out.println(time + "です。");
    }

}
