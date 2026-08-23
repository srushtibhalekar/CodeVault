import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Developer developer =
                new Developer("Srushti", "developer@example.com");

        CodeVaultManager manager =
                new CodeVaultManager();

        boolean running = true;

        while (running) {

            System.out.println("\n==========================");
            System.out.println("       CODEVAULT");
            System.out.println("==========================");
            System.out.println("1. View Profile");
            System.out.println("2. Add Skill");
            System.out.println("3. Add Coding Problem");
            System.out.println("4. Add Daily Goal");
            System.out.println("5. View Dashboard");
            System.out.println("6. View Skills");
            System.out.println("7. View Problems");
            System.out.println("8. View Goals");
            System.out.println("9. View Achievements");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    developer.displayProfile();
                    developer.showStreakMessage();
                    break;

                case 2:

                    System.out.print("Enter skill name: ");
                    String skillName = scanner.nextLine();

                    int level;

                    do {
                        System.out.print("Enter skill level (1-10): ");
                        level = scanner.nextInt();
                        scanner.nextLine();

                        if (level < 1 || level > 10) {
                            System.out.println(
                                "Please enter a level between 1 and 10."
                            );
                        }

                    } while (level < 1 || level > 10);

                    manager.addSkill(
                            new Skill(skillName, level)
                    );

                    System.out.println(
                        "Skill added successfully!"
                    );

                    break;

                case 3:

                    System.out.print("Enter problem title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter difficulty: ");
                    String difficulty = scanner.nextLine();

                    manager.addProblem(
                            new CodingProblem(title, difficulty)
                    );

                    System.out.println(
                        "Problem added successfully!"
                    );

                    break;

                case 4:

                    System.out.print("Enter today's goal: ");
                    String goalText = scanner.nextLine();

                    manager.addGoal(
                            new Goal(goalText)
                    );

                    System.out.println(
                        "Goal added successfully!"
                    );

                    break;

                case 5:
                    manager.showDashboard();
                    break;

                case 6:
                    manager.displaySkills();
                    break;

                case 7:
                    manager.displayProblems();
                    break;

                case 8:
                    manager.displayGoals();
                    break;

                case 9:
                    manager.displayAchievements();
                    break;

                case 10:
                    running = false;
                    System.out.println(
                        "Thank you for using CodeVault!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please try again."
                    );
            }
        }

        scanner.close();
    }
}