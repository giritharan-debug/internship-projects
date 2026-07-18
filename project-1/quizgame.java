import java.util.Scanner;

public class quizgame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.println(" JAVA QUIZ GAME ");
        System.out.println("\n1. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. PHP");
        int ans = sc.nextInt();

        if (ans == 1) {
            score++;
        }
        System.out.println("\n2. What does CPU stand for?");
        System.out.println("1. Central Process Unit");
        System.out.println("2. Central Processing Unit");
        System.out.println("3. Computer Processing Unit");
        System.out.println("4. Control Processing Unit");
        ans = sc.nextInt();

        if (ans == 2) {
            score++;
        }
        System.out.println("\n3. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.println("4. create");
        ans = sc.nextInt();

        if (ans == 2) {
            score++;
        }
        System.out.println("\n4. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Database");
        System.out.println("3. Browser");
        System.out.println("4. Operating System");
        ans = sc.nextInt();

        if (ans == 1) {
            score++;
        }
        System.out.println("\n5. Which company developed Java?");
        System.out.println("1. Google");
        System.out.println("2. Microsoft");
        System.out.println("3. Sun Microsystems");
        System.out.println("4. Apple");
        ans = sc.nextInt();

        if (ans == 3) {
            score++;
        }

        System.out.println("\nRESULT ");
        System.out.println("Your Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("super bro!");
        } else {
            System.out.println("dont lose hope , try again!");
        }

        sc.close();
    }
}