public class Achievement {

    private String title;
    private String description;

    public Achievement(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void displayAchievement() {
        System.out.println("🏆 " + title);
        System.out.println("   " + description);
    }
}