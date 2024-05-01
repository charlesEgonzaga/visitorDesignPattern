package visitorDesignPattern;

import java.util.Scanner;

public class Store {
   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        furniture chair = new chair();
        furniture sofa = new sofa();
        furniture table = new table();

        ShippingFee visitor = new standardShipping();

        System.out.print("Enter the distance in kilometer/s:");
        double distance = input.nextInt(); 

        System.out.println("Shipping cost for Chair: " + chair.accept(visitor, distance));
        System.out.println("Shipping cost for Sofa: " + sofa.accept(visitor, distance));
        System.out.println("Shipping cost for Table: " + table.accept(visitor, distance));
    }
}
