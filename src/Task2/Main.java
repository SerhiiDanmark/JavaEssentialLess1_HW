package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введіть два значення сторін прямокутника: ");
        Scanner input = new Scanner (System.in);

        double value1 = input.nextDouble();
        double value2 = input.nextDouble();

        Rectangle rectangle = new Rectangle();
        double area = rectangle.areaCalculator(value1, value2);
        double perimeter = rectangle.perimeterCalculator(value1, value2);

        System.out.println("Площа прямокутника складає: " + area);
        System.out.println("Периметр прямокутника складає: " + perimeter);
    }
}
