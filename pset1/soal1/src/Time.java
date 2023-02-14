/**
 * Kelas Time merepresentasikan waktu.
 *
 * @author  Ahmad Zein Haddad
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    /**
     * Menginstansiasi Time dengan hour, minute, dan second tertentu, tidak ada validasi input disini.
     */
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

    /**
     * Mengatur jam ke waktu tertentu, input akan divalidasi.
     * @param hour atur jam ke ini.
     */
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = 23;
        }
    }

    /**
     * Mengatur menit ke waktu tertentu, input akan divalidasi.
     * @param minute atur menit ke ini.
     */
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

    /**
     * Mengatur detik ke waktu tertentu, input akan divalidasi.
     * @param second atur detik ke ini.
     */
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

    /**
     * Atur ke waktu yang ditentukan, input akan divalidasi.
     * @param hour jam
     * @param minute menit
     * @param second detik
     */
    public void setTime(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d",
            hour,
            minute,
            second
        );
    }

    /**
     * Mengatur waktu ke detik berikutnya, akan berganti menit/jam jika diperlukan.
     * @return this
     */
    public Time nextSecond() {
        this.setSecond(this.second + 1);
        return this;
    }

    /**
     * Mengatur waktu ke detik sebelumnya, akan berganti menit/jam jika diperlukan.
     * @return this
     */
    public Time previousSecond() {
        this.setSecond(this.second - 1);
        return this;
    }
}
