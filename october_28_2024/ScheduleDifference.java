package october_28_2024;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDifference {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.scheduleAtFixedRate(() -> {
            long currentTimeSeconds = System.currentTimeMillis() / 1000;
            System.out.println("Task with fixed delay executed at:" + currentTimeSeconds + "");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
        }, 0, 3, TimeUnit.SECONDS);

        Thread.sleep(15000);

        scheduler.shutdown();
    }
}