package Exercise_03_05;

/*
Dorota Matkowska
zadanie 5
*/


public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        if(check()) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else System.out.println("Podano zla date");
    }

    public boolean check(){
        if(hour<0||hour>23)return false;
        else if(minute<0||minute>59)return false;
        else if(second<0||minute>59)return false;
        else return true;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public String toString() {
        String godz = Integer.toString(hour);
        String minu = Integer.toString(minute);
        String seku = Integer.toString(second);

        while (godz.length() < 2) godz = "0" + godz;
        while (minu.length() < 2) minu = "0" + minu;
        while (seku.length() < 2) seku = "0" + seku;

        return "Time["+godz+":"+minu+":"+seku+"]";
    }


    public int nextSecond(){
        second=second+1;
        return second;
    }


    public int previousSecond(){
        second=second-1;
        return second;
    }
}