import java.time.LocalTime;
import java.util.Scanner;

public class EventReminder {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        // Input reminder time
        System.out.print("Enter reminder time (HH:MM:SS): ");
        String inputTime = sc.nextLine();

        LocalTime reminderTime = LocalTime.parse(inputTime);

        System.out.print("Enter reminder message: ");
        String message = sc.nextLine();

        System.out.println("Reminder set... Waiting ⏳");

        while (true) {
            LocalTime currentTime = LocalTime.now();

            // Trigger when current time is equal OR passed
            if (!currentTime.isBefore(reminderTime)) {
                System.out.println("🔔 Reminder: " + message);
                break;
            }

            Thread.sleep(1000);
        }

        sc.close();
    }
}