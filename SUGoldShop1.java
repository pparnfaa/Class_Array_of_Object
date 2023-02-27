package Class_Programming.ArrayOfObject;

/*import java.util.Scanner;

class Item {
    boolean gold_type;
    double weight;
    double sum_price;
    double sum_buy;

    Item(boolean gold_type, double weight) {
        this.gold_type = gold_type;
        this.weight = weight;
    }

    double saleprice(double pricegold) {
        if (gold_type == true) {
            sum_price = (pricegold * weight) + (1000 * weight);
        } else {
            sum_price = (pricegold * weight);
        }
        return sum_price;
    }

    double buyprice(double pricegold) {
        if (gold_type == true) {
            sum_buy = pricegold * weight * (0.98);
        } else {
            sum_buy = (pricegold - 100) * (weight);
        }
        return sum_buy;
    }

    void showdetail(double pricegold) {
        if (gold_type == true) {
            System.out.print("ornament " + weight + " baht");
        } else {
            System.out.print("bar " + weight + " baht");
        }
    }

}*/

public class SUGoldShop1 {
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
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }
    }
}
