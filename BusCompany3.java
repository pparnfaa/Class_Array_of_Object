package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class Bus3 {
    public String id;
    public int type;
    private int seats;
    private int seats_booking = 0;
    private boolean status = false;

    public Bus3(String id, int type, int seats) {
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

public class BusCompany3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();
        Bus3 b[] = new Bus3[Q + 1];
        int count[] = new int[Q + 1];
        for (int i = 1; i < Q + 1; i++) {
            String id = scan.next();
            int type = scan.nextInt();
            int seats = scan.nextInt();
            b[i] = new Bus3(id, type, seats);
        }
        int N = scan.nextInt();
        for (int i = 1; i < N + 1; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            int T = scan.nextInt();
            boolean check = false;
            for (int j = 1; j < Q + 1; j++) {
                if (P == 1 && b[j].type == T) {
                    if (b[j].reserve(K) == true) {
                        System.out.println(b[j].id);
                        check = true;
                        break;
                    }
                } else if (P == 2 && j == T) {
                    b[j].sendToRepair();
                } else if (P == 3 && j == T) {
                    b[j].backToService();
                }
            }
            if (check == false && P == 1) {
                System.out.println("sorry");
            }
        }
    }
}
