package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class Bus {
    public String id;
    public int type;
    public int seats;
    public int seats_booking = 0;
    public boolean status = false;

    Bus(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    public void printStats() {
        System.out.println(id);
        if (type == 1) {
            System.out.println("Fan");
        } else if (type == 2) {
            System.out.println("P1");
        } else if (type == 3) {
            System.out.println("VIP");
        }
        System.out.println(seats_booking + " " + seats);
        if (status == false) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }

    }
}

public class BusCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        b.printStats();
    }

}
