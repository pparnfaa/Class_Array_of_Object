package Class_Programming.ArrayOfObject;

import java.util.Scanner;

class House1 {
    public int landSize;
    public int quality;
    public int floors;
    public int houseArea;
    public int price;

    public House1(int landSize, int quality, int floors, int houseArea) {
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice(landSize, quality, floors, houseArea);
    }

    int computePrice(int landSize, int quality, int floors, int houseArea) {
        price += landSize * (10000);
        if (quality == 1) {
            price += houseArea * (10000);
        } else if (quality == 2) {
            price += houseArea * (8000);
        } else if (quality == 3) {
            price += houseArea * (5000);
        }
        if (floors > 1) {
            price += (floors - 1) * (200000);
        }
        return price;
    }
}

public class HousePrice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        House1 house[] = new House1[n + 1];
        for (int i = 1; i < n + 1; i++) {
            int landSize = scan.nextInt();
            int quality = scan.nextInt();
            int floors = scan.nextInt();
            int houseArea = scan.nextInt();
            house[i] = new House1(landSize, quality, floors, houseArea);
        }
        int target_price = scan.nextInt();
        int target_area = scan.nextInt();
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (house[i].price <= target_price && house[i].houseArea >= target_area) {
                System.out.println(house[i].landSize + " " + house[i].quality + " " + house[i].floors + " "
                        + house[i].houseArea + " " + house[i].price);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("none");
        }
    }
}
