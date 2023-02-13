public class Time {
    private int hour;
    private int minute;
    private int second;

    private String formatTimeUnit(int time) {
        return (time < 10) ? ("0" + Integer.toString(time)) : Integer.toString(time);
    }

    public static void main(String[] args) {
        Time time = new Time(0, 0, 5);

        do {
            System.out.println(time);
            time.previousSecond();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        } while(true);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = 23;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else if (minute >= 60) {
            this.minute = 0;
            this.setHour(this.hour + 1);
        } else {
            this.minute = 59;
            this.setHour(this.hour - 1);
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else if (second >= 60) {
            this.second = 0;
            this.setMinute(this.minute + 1);
        } else {
            this.second = 59;
            this.setMinute(this.minute - 1);
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public String toString() {
        return String.format("%s:%s:%s",
            formatTimeUnit(hour),
            formatTimeUnit(minute),
            formatTimeUnit(second)
        );
    }

    public Time nextSecond() {
        this.setSecond(this.second + 1);
        return this;
    }

    public Time previousSecond() {
        this.setSecond(this.second - 1);
        return this;
    }
}
