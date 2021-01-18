import myPackage.Circle;
import myPackage.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Manu: ");
        System.out.println("*1: Circle");
        System.out.println("*2: Rectangle");
        System.out.println("Hay chon 1 hoac 2:");

        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Circle:");

                System.out.println("Nhap ban kinh:");
                float radius = scanner.nextFloat();

                System.out.println("Area's Circle: " + Circle.area(radius));
                System.out.println("Peri's Circle: " + Circle.perimeter(radius));
                break;
            case 2:
                System.out.println("Rectangle:");

                System.out.println("Nhap chieu rong:");
                float width = scanner.nextFloat();

                System.out.println("Nhap chieu cao:");
                float height = scanner.nextFloat();

                System.out.println("Rectangle's Area: " + Rectangle.area(width, height));
                System.out.println("Rectangle's " + Rectangle.perimeter(width, height));
                break;
            default:
                System.out.println("Chon lai:");
        }
        System.out.println("Ket thuc chuong trinh !");
    }
}
