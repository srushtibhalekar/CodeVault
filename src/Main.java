public class Main {

    public static void main(String[] args) {

        Developer developer =
                new Developer("Srushti", "developer@example.com");

        CodeVaultManager manager =
                new CodeVaultManager();

        Skill java =
                new Skill("Core Java", 8);

        Skill dsa =
                new Skill("DSA", 6);

        CodingProblem problem1 =
                new CodingProblem("Two Sum", "Easy");

        CodingProblem problem2 =
                new CodingProblem("Binary Search", "Medium");

        Goal goal =
                new Goal("Solve 3 coding problems today");

        Achievement achievement =
                new Achievement(
                    "Java Explorer",
                    "Completed Core Java fundamentals"
                );

        manager.addSkill(java);
        manager.addSkill(dsa);

        manager.addProblem(problem1);
        manager.addProblem(problem2);

        manager.addGoal(goal);
        manager.addAchievement(achievement);

        developer.increaseStreak();

        developer.displayProfile();

        manager.displaySkills();
        manager.displayProblems();
        manager.displayGoals();
        manager.displayAchievements();
    }
}