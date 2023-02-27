package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class Item {
    boolean gold_type;
    double weight;
    static double sum_price;
    static double sum_buy;
    static double count_sale;
    static double count_buy;

    Item(boolean gold_type, double weight) {
        this.gold_type = gold_type;
        this.weight = weight;
    }

    double saleprice(double pricegold) {
        count_sale += weight;
        if (gold_type == true) {
            sum_price += (pricegold * weight) + (1000 * weight);
        } else {
            sum_price += (pricegold * weight);
        }
        return sum_price;
    }

    double buyprice(double pricegold) {
        count_buy += weight;
        if (gold_type == true) {
            sum_buy += pricegold * weight * (0.98);
        } else {
            sum_buy += (pricegold - 100) * (weight);
        }
        return sum_buy;
    }

    void showdetail() {
        System.out.println(count_sale + " " + sum_price);
        System.out.println(count_buy + " " + sum_buy);
    }

}

public class SUGoldShop2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")) {
                arrayx[i] = new Item(true, weight);
            } else {
                arrayx[i] = new Item(false, weight);
            }
            if (cmdline.equalsIgnoreCase("s")) {
                arrayx[i].saleprice(pricegold);
            } else if (cmdline.equalsIgnoreCase("b")) {
                arrayx[i].buyprice(pricegold);
            }
        }
        arrayx[n - 1].showdetail();
    }
}
