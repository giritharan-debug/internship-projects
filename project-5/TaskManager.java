import java.util.*;
import java.io.*;

public class TaskManager {

    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        loadTasks();

        while (true) {

            System.out.println("\n===== TASK MANAGER =====");
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

                case 3:
                    updateTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    public static void addTask() {

        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        tasks.add(new Task(id, name));

        saveTasks();

        System.out.println("Task Added Successfully!");
    }

    public static void viewTasks() {

        if (tasks.isEmpty()) {
            System.out.println("No Tasks Available.");
            return;
        }

        System.out.println("\n===== TASK LIST =====");

        for (Task t : tasks) {
            System.out.println(t.id + " - " + t.name);
        }
    }

    public static void updateTask() {

        System.out.print("Enter Task ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Task t : tasks) {

            if (t.id == id) {

                System.out.print("Enter New Task Name: ");
                t.name = sc.nextLine();

                saveTasks();

                System.out.println("Task Updated Successfully!");
                return;
            }
        }

        System.out.println("Task Not Found!");
    }

    public static void deleteTask() {

        System.out.print("Enter Task ID to Delete: ");
        int id = sc.nextInt();

        Iterator<Task> iterator = tasks.iterator();

        while (iterator.hasNext()) {

            Task t = iterator.next();

            if (t.id == id) {

                iterator.remove();

                saveTasks();

                System.out.println("Task Deleted Successfully!");
                return;
            }
        }

        System.out.println("Task Not Found!");
    }

    public static void saveTasks() {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"));

            for (Task t : tasks) {
                writer.write(t.id + "," + t.name);
                writer.newLine();
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error Saving File.");
        }
    }

    public static void loadTasks() {

        File file = new File("tasks.txt");

        if (!file.exists())
            return;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];

                tasks.add(new Task(id, name));
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error Loading File.");
        }
    }
}