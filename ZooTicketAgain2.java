package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class ZooTicketB {
    boolean type;
    boolean used = false; // not use
    boolean used_ride = false;

    ZooTicketB(boolean type) {
        this.type = type;
    }

    boolean enterZoo(int height) {
        boolean check;
        if (type == true) {
            if (used == false) {
                if (height > 120) {
                    check = false;
                } else {
                    check = true;
                    used = true;
                }
            } else {
                check = false;
            }
        } else {
            if (used == false) {
                check = true;
                used = true;
            } else {
                check = false;
            }
        }
        return check;
    }

    boolean useRide() {
        boolean check_ride;
        if (used == true) {
            if (used_ride == false) {
                check_ride = true;
                used_ride = true;
            } else {
                check_ride = false;
            }
        } else {
            check_ride = false;
        }
        return check_ride;
    }

}

public class ZooTicketAgain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        ZooTicketB tickets[] = new ZooTicketB[N];
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                tickets[i] = new ZooTicketB(false);
            } else {
                tickets[i] = new ZooTicketB(true);
            }
        }

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int id = scan.nextInt();
            int type = scan.nextInt();
            if (type == 1) {
                int height = scan.nextInt();
                System.out.println(tickets[id - 1].enterZoo(height));
            } else if (type == 2) {
                System.out.println(tickets[id - 1].useRide());
            }
        }
    }
}
