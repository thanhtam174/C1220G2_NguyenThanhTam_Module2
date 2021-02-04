package _04_class_and_object.exercises;


import java.time.Duration;
import java.time.Instant;

public class StopWatch {

    private Instant startTime;
    private Instant endTime;

    public Instant getStartTime() {
        return startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    StopWatch() {
        this.startTime = Instant.now();
    }

    public void start() {
        this.startTime = Instant.now();
    }

    public void stop() {
        this.endTime = Instant.now();
    }

    public long getElapsedTime() {
        long times = Duration.between(this.startTime, this.endTime).toMillis();
        return times;
    }

    public static void main(String[] args) {
        StopWatch time1 = new StopWatch();
        time1.start();
        double numbers[] = new double[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.round(Math.random() * 1000);
        }
        double temp = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println();
        time1.stop();
        System.out.println(time1.getElapsedTime()+" milliseconds");
    }

}
