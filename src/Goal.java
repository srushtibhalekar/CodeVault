public class Goal {

    private String description;
    private boolean completed;

    public Goal(String description) {
        this.description = description;
        this.completed = false;
    }

    public void completeGoal() {
        completed = true;
    }

    public void displayGoal() {
        String status = completed ? "Completed" : "Pending";

        System.out.println(description + " - " + status);
    }
}