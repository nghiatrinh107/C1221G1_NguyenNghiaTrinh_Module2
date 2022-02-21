package ss4_lop_va_doi_tuong.bai_tap.stop_watch;

import java.sql.Timestamp;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;
    public StopWatch() {
        startTime = LocalTime.now();
    }

    public LocalTime getStarTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void star() {
        this.startTime = LocalTime.now();
    }

    public void end() {
        this.endTime = LocalTime.now();
    }

    public long getElapsedTime() {
        long milisecond;
        milisecond = (((this.endTime.getHour() - this.startTime.getHour()) * 3600 + (this.endTime.getMinute() - this.startTime.getMinute()) * 60 + (this.endTime.getSecond() - this.startTime.getSecond()) * 1000));
        return milisecond;
    }

}
