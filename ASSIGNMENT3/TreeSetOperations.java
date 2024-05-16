import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // (a) Display the TreeSet
        System.out.println("TreeSet elements: " + treeSet);

        // (b) Search for a number in the TreeSet
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search in the TreeSet: ");
        int numberToSearch = scanner.nextInt();
        if (treeSet.contains(numberToSearch)) {
            System.out.println(numberToSearch + " is present in the TreeSet.");
        } else {
            System.out.println(numberToSearch + " is not present in the TreeSet.");
        }

        // (c) Remove an element from the TreeSet
        System.out.print("Enter an element to remove from the TreeSet: ");
        int elementToRemove = scanner.nextInt();
        if (treeSet.remove(elementToRemove)) {
            System.out.println("Element " + elementToRemove + " removed successfully.");
            System.out.println("Updated TreeSet: " + treeSet);
        } else {
            System.out.println("Element " + elementToRemove + " not found in the TreeSet.");
        }
    }
}