package pacages;

import java.util.Scanner;

public class MyClass {
    static DoublyLinkedList list = new DoublyLinkedList();
//    static MaxHeap heap = new MaxHeap(100);
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[])
    {
        String choice = "y";
        int menuChoice = 0;
        do
        {
            System.out.println("MENU\n1. Enter car Details\n2. Delete Last car Data\n3. Delete first Car data\n4. Display all Cars\n5. Exit");
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
            }
            System.out.println("Do you wish to continue? y or n");
            choice = sc.next();

        }while(choice.equals("y") || choice.equals("Y"));

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
//        heap.insertion(car);
    }
}
