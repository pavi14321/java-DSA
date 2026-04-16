import java.time.LocalTime;
import java.util.Scanner;

public class EventReminder {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        // Input reminder time
        System.out.print("Enter reminder time (HH:MM:SS): ");
        String inputTime = sc.nextLine();

        LocalTime reminderTime = LocalTime.parse(inputTime);

        System.out.println("Reminder set... Waiting ⏳");

        // Loop to check time every second
        while (true) {
            LocalTime currentTime = LocalTime.now();

            if (currentTime.getHour() == reminderTime.getHour() &&
                currentTime.getMinute() == reminderTime.getMinute() &&
                currentTime.getSecond() == reminderTime.getSecond()) {

                System.out.println("🔔 Reminder! Time reached!");
                break;
            }

            Thread.sleep(1000); // wait 1 second
        }

        sc.close();
    }
}