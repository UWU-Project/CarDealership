package pacages;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class MyClass {
    static DoublyLinkedList list = new DoublyLinkedList();
    static Stack<Cars> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        loadSampleData();
        String choice = "y";
        int menuChoice = 0;
        do {

            System.out.println("-------------------------------------\n|\t\t\t\t MENU \t\t\t\t|\n-------------------------------------\n| \t1. Add Car Details\t\t\t\t|\n| " +
                    "\t2. Display all Cars \t\t\t|\n| \t3. Display Latest car \t\t\t|\n| \t4. Delete first Car data\t\t|\n| \t5. Delete Last car Data\t\t\t|\n| " +
                    "\t6. Filter & Buy a Car \t\t\t|\n| \t7. Exit \t\t\t\t\t\t|\n-------------------------------------\n Selection: ");
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1 -> getCarDetails();
                case 2 -> list.display();
                case 3 -> System.out.println(stack.peek());
                case 4 -> list.deleteAtHead();
                case 5 -> list.deleteAtTail();
                case 6 -> {
                    Cars car = list.filter();
                    System.out.print("If you wish to buy, press 1: ");
                    int buy = sc.nextInt();
                    if (buy == 1) {
                        buyCar(car);
                    }
                }
            }

            System.out.println("Do you wish to continue? y or n");
            choice = sc.next();

        } while (choice.equals("y") || choice.equals("Y"));

    }

    private static void loadSampleData() {
        Cars car1 = new Cars("BMW", "i8", 2020, "122133", 12345);
        stack.push(car1);
        list.appendAtTail(car1);

        Cars car2 = new Cars("Audi", "A7", 2020, "122133", 12345);
        stack.push(car2);
        list.appendAtTail(car2);
    }

    private static void buyCar(Cars car) {
        HashMap<Cars, String> buyer = new HashMap<>();

        System.out.print("Enter your name: ");
        String buyerName = sc.next();
        buyer.put(car, buyerName);
        System.out.println(buyerName + " bought " + buyer.keySet());
    }

    public static void getCarDetails() {
        Cars car = new Cars();


        System.out.println("Enter Manufacturer: ");
        car.setMake(sc.next());
        System.out.println("Enter Model: ");
        car.setModel(sc.next());
        System.out.println("Enter Year: ");
        car.setYear(sc.nextInt());
        System.out.println("Enter Mileage: ");
        car.setMileage(sc.next());
        System.out.println("Enter Price: ");
        car.setPrice(sc.nextDouble());
        list.appendAtTail(car);

        stack.push(car);

    }

}
