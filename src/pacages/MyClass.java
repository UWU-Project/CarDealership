package pacages;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class MyClass {
    static DoublyLinkedList list = new DoublyLinkedList();
    static Stack<Cars> stack = new Stack<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        loadSampleData();
        String choice = "y";
        int menuChoice = 0;
        do
        {
            System.out.println("MENU\n1. Enter car Details\n2. Delete Last car Data\n3. Delete first Car data\n4. Display all Cars\n5. Filter a car\n6. Display Latest car\n7. Exit");
            menuChoice = sc.nextInt();
            switch(menuChoice)
            {
                case 1: getCarDetails();
                    break;
                case 2: list.deleteAtTail();
                    break;
                case 3: list.deleteAtHead();

                    break;
                case 4: list.display();

                    break;
                case 5:
                    Cars car = list.filter();
                    System.out.print("If you wish to buy, press 1: ");
                    int buy = sc.nextInt();
                    if (buy == 1) {
                        buyCar(car);
                    }
                    break;

                case 6:
                    System.out.println(stack.peek());

            }
            System.out.println("Do you wish to continue? y or n");
            choice = sc.next();

        }while(choice.equals("y") || choice.equals("Y"));

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

    public static void getCarDetails(){
        Cars car = new Cars();


        System.out.println("Enter Make: ");
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
