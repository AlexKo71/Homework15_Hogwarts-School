public class Slytherin extends Hogwarts {
    private int cunning;
    private int resourcefulness;
    private int lustOfPower;
    private int determination;
    private int ambition;

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public Slytherin(String name, int transgression, int powerOfMagic, int cunning, int resourcefulness, int lustOfPower,
                     int determination, int ambition) {
        super(name, transgression, powerOfMagic);
        this.cunning = cunning;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    @Override
    public String toString() {
        return "Слизерин: " + super.toString() +
                " хитрость - " + cunning +
                " баллов, находчивость - " + resourcefulness +
                " баллов, жажда власти - " + lustOfPower +
                " баллов, решительность - " + determination +
                " баллов, амбционость - " + ambition +
                " баллов";
    }

    public int scoreSlytherin() {
        return super.score() + cunning + resourcefulness + lustOfPower + determination + ambition;
    }
}
