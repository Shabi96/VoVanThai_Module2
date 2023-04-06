package ss4_class_and_oop.bai_tap.stop_watch;

public class StopWatch {
    public long startTime = System.currentTimeMillis();
    public long endTime;
    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long start() {
        return startTime = System.currentTimeMillis();
    }
    public long stop() {
        return endTime  = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
