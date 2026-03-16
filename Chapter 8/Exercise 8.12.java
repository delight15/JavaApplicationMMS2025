public class DateAndTime {

    private int day, month, year;
    private int hour, minute, second;

    public DateAndTime(int d,int m,int y,int h,int min,int s) {
        day=d;
        month=m;
        year=y;
        hour=h;
        minute=min;
        second=s;
    }

    public void incrementHour() {

        hour++;

        if(hour==24){
            hour=0;
            nextDay();
        }
    }

    public void nextDay(){
        day++;
    }

    public String toString(){
        return day+"/"+month+"/"+year+" "+hour+":"+minute+":"+second;
    }
}