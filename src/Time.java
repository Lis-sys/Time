public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Недопустимые значения времени");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void changeTimeTo(int hours, int minutes, int seconds) {
        int totalSeconds = hour * 3600 + minute * 60 + second;
        totalSeconds += hours * 3600 + minutes * 60 + seconds;

        if (totalSeconds < 0) {
            totalSeconds += 24 * 3600;
        } else if (totalSeconds >= 24 * 3600) {
            totalSeconds -= 24 * 3600;
        }

        hour = totalSeconds / 3600;
        minute = (totalSeconds % 3600) / 60;
        second = (totalSeconds % 3600) % 60;
    }

    public static void main(String[] args) {
        //Time time = new Time(12, 30, 40);
        //System.out.println("Исходное время: " + time.hour + ":" + time.minute + ":" + time.second);

        //time.changeTimeTo(12, 15, 30);
       //System.out.println("Измененное время: " + time.hour + ":" + time.minute + ":" + time.second);
    }
}
