public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int transgression, int powerOfMagic, int nobility, int honor, int bravery) {
        super(name, transgression, powerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Гриффиндор: " + super.toString() +
                " благородство - " + nobility +
                " баллов, честь - " + honor +
                " баллов, храбрость - " + bravery +
                " баллов";
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int scoreGryffindor() {
        return super.score() + nobility + honor + bravery;
    }

}
