package practice;

public class AlarmClock extends Clock{
    String alarmTime;

    AlarmClock(String time){
        super(time);
    }

    public void alarm(){
        if (time.equals(alarmTime)){
            System.out.println("アラームが鳴りました！");
        }
    }

    public void setAlarm(String time){
        this.alarmTime = time;
    }

}
