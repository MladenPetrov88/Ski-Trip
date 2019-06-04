import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String mark = scanner.nextLine();
        int nights = days - 1;
        double roomPrice = 0;
        if (room.equals("room for one person")) {
            roomPrice = 18.00;
            } else if (room.equals("apartment")) {
            roomPrice = 25.00;
            } else if (room.equals("president apartment")) {
            roomPrice = 35.00;
        }
        double totalPrice = nights * roomPrice;

        if (room.equals("apartment")) {
            if (days < 10) {
                totalPrice = totalPrice - totalPrice * 0.30;
            } else if (days >=10 && days <= 15) {
                totalPrice = totalPrice - totalPrice * 0.35;
            } else if (days > 15) {
                totalPrice = totalPrice - totalPrice * 0.50;
            }
        }
        if (room.equals("president apartment")) {
            if (days < 10) {
                totalPrice = totalPrice - totalPrice * 0.10;
            } else if (days >= 10 && days <=15) {
                totalPrice = totalPrice - totalPrice * 0.15;
            } else if (days > 15) {
                totalPrice = totalPrice - totalPrice * 0.20;
            }
        } if (mark.equals("positive")) {
            totalPrice = totalPrice + totalPrice * 0.25;
        } else if (mark.equals("negative")) {
            totalPrice = totalPrice - totalPrice * 0.10;
        }
        System.out.printf("%.2f", totalPrice);
    }

}

