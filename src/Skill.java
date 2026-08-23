public class Skill {

    private String skillName;
    private int level;

    public Skill(String skillName, int level) {
        this.skillName = skillName;
        this.level = level;
    }

    public void displaySkill() {
        System.out.println(skillName + " - Level " + level + "/10");
    }
}