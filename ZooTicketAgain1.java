package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class ZooTicketA {
    boolean type;
    boolean used = false; // not use

    ZooTicketA(boolean type) {
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
}

public class ZooTicketAgain1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        ZooTicketA tickets[] = new ZooTicketA[N + 1];
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                tickets[i] = new ZooTicketA(false);
            } else {
                tickets[i] = new ZooTicketA(true);
            }
        }

        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            int id = scan.nextInt();
            int height = scan.nextInt();
            System.out.println(tickets[id - 1].enterZoo(height));
        }
    }

}
