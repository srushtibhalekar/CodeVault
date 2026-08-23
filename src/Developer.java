public class Developer {

    private String name;
    private String email;
    private int codingStreak;

    public Developer(String name, String email) {
        this.name = name;
        this.email = email;
        this.codingStreak = 0;
    }

    public void displayProfile() {
        System.out.println("\n===== DEVELOPER PROFILE =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Coding Streak: " + codingStreak + " days");
    }

    public void increaseStreak() {
        codingStreak++;
    }
}