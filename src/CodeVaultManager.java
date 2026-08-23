import java.util.ArrayList;

public class CodeVaultManager {

    private ArrayList<Skill> skills;
    private ArrayList<CodingProblem> problems;
    private ArrayList<Goal> goals;
    private ArrayList<Achievement> achievements;

    public CodeVaultManager() {
        skills = new ArrayList<>();
        problems = new ArrayList<>();
        goals = new ArrayList<>();
        achievements = new ArrayList<>();
    }

    public void addSkill(Skill skill) {
        skills.add(skill);
    }

    public void addProblem(CodingProblem problem) {
        problems.add(problem);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    public void addAchievement(Achievement achievement) {
        achievements.add(achievement);
    }

    public void displaySkills() {
        System.out.println("\n===== SKILLS =====");

        for (Skill skill : skills) {
            skill.displaySkill();
        }
    }

    public void displayProblems() {
        System.out.println("\n===== CODING PROBLEMS =====");

        for (CodingProblem problem : problems) {
            problem.displayProblem();
        }
    }

    public void displayGoals() {
        System.out.println("\n===== DAILY GOALS =====");

        for (Goal goal : goals) {
            goal.displayGoal();
        }
    }

    public void displayAchievements() {
        System.out.println("\n===== ACHIEVEMENTS =====");

        for (Achievement achievement : achievements) {
            achievement.displayAchievement();
        }
    }
}