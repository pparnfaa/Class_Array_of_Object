package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class Bus2 {
    public String id;
    public int type;
    public int seats;
    public int seats_booking = 0;
    public boolean status = false;

    Bus2(String id, int type, int seats) {
        this.id = id;
        this.type = type;
        this.seats = seats;
    }

    public boolean reserve(int K) {
        if (K <= 0 || seats - seats_booking < K || status == true) {
            return false;
        } else {
            seats_booking += K;
            return true;
        }
    }

    public void sendToRepair() {
        status = true;
    }

    public void backToService() {
        status = false;
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
        if (status == true) {
            System.out.println("Inactive");
        } else {
            System.out.println("Active");
        }
    }
}

public class BusCompany2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus2 b = new Bus2(id, type, seats);
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                b.reserve(K);
            } else if (P == 2) {
                b.sendToRepair();
            } else if (P == 3) {
                b.backToService();
            }
            b.printStats();
        }
    }
}
