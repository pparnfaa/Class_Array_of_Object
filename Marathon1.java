package Class_Programming.ArrayOfObject;

import java.util.Scanner;

/*class Runner {
    String name;
    int type;
    static int count = 0;
    String sum = "";

    Runner(String name, int type) {
        this.name = name;
        this.type = type;
        if (type == 1) {
            sum = "A";
            count++;
        } else if (type == 2) {
            sum = "B";
            count++;
        } else if (type == 3) {
            sum = "C";
            count++;
        } else if (type == 4) {
            sum = "D";
            count++;
        } else {
            sum = "";
        }
    }

    void printInfo() {
        if (sum.length() > 0) {
            if (count < 10) {
                System.out.println(sum + "00" + count + " " + name);
            } else {
                System.out.println(sum + "0" + count + " " + name);

            }
        } else {
            System.out.println("INVALID");
        }

    }

}*/

public class Marathon1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Runner data[] = new Runner[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int type = scan.nextInt();
            data[i] = new Runner(name, type);
            data[i].printInfo();
        }
    }
}
