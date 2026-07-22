import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void viewTasks() {

    if (tasks.isEmpty()) {
        System.out.println("No Tasks Available.");
        return;
    }

    for (Task t : tasks) {
        System.out.println(t.id + " - " + t.name);
    }
}
    public static void addTask() {

    System.out.print("Enter Task ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Task Name: ");
    String name = sc.nextLine();
    tasks.add(new Task(id, name));

    System.out.println("Task Added Successfully!");
}
    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n TASK MANAGER ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    viewTasks();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}