public class CodingProblem {

    private String title;
    private String difficulty;
    private boolean solved;

    public CodingProblem(String title, String difficulty) {
        this.title = title;
        this.difficulty = difficulty;
        this.solved = false;
    }

    public void solveProblem() {
        solved = true;
    }

    public void displayProblem() {
        String status = solved ? "Solved" : "Pending";

        System.out.println(
            title + " | " + difficulty + " | " + status
        );
    }
}