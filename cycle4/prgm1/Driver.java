//Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures.
//package graphics;
import graphics.circle;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    	System.out.println("Merin Magi Telson");
	System.out.println("23MCA043");
	System.out.println("12/04/2024");
        Scanner sc = new Scanner(System.in);
        int choice;
        circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
        System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle: ");       
        
        do {
           
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj1.area();
                    break;
                case 2:
                    obj2.area();
                    break;
                case 3:
                    obj3.area();
                    break;
                case 4:
                    obj4.area();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 5);
        
        sc.close();
    }
}

