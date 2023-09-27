import java.util.Scanner;

public class overcooking {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();

        int cookingTime = scanner.nextInt();

        scanner.close();

        int endHour = (currentHour + (currentMinute + cookingTime) / 60) % 24;
        int endMinute = (currentMinute + cookingTime) % 60;

        System.out.println(endHour + " "+ endMinute);
    }
}