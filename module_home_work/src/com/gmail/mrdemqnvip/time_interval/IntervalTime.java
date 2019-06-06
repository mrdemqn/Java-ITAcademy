package com.gmail.mrdemqnvip.time_interval;

public class IntervalTime {
    private  int sec;
    private  int min;
    private int hour;
    private int commonSec;

    public IntervalTime(int hour, int minute, int sec) {
        if ((hour<0 || hour>23) || (minute<0 || minute>59) || (sec <0 || sec >59)) throw new IllegalArgumentException("Error format of time. Hour must be in interval more then 0 less then 24, minutes and seconds must be in interval more then 0 less then 60");
        this.hour = hour;
        this.min = minute;
        this.sec = sec;
        this.commonSec = getCommonSec();
    }

    public IntervalTime(int commonSec) {
        this.commonSec = commonSec;
        convert(commonSec);
    }

    public int getCommonSec() {
        if(commonSec == 0){
            commonSec = sec +60*(min +hour*60);
        }
        return commonSec;
    }

    private void convert(int commonSeconds){
        sec = commonSeconds%60;
        int m = (commonSeconds- sec)/60;
        min = m%60;
        hour = (m- min)/60;
    }

    public int compareTo(IntervalTime o) {
        return commonSec - o.commonSec;
    }

    @Override
    public String toString() {
        String time;
        time = hour < 10 ? "0" + hour + ":" :hour + ":";
        time = min < 10 ? time + "0" + min + ":" :time + min +":";
        time = sec < 10 ? time + "0" + sec :time + sec;
        return "time interval: " + time;
    }

}

