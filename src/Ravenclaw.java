public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wisdom;
    private int creation;
    private int wit;

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public Ravenclaw(String name, int transgression, int powerOfMagic, int smart, int wisdom, int creation, int wit) {
        super(name, transgression, powerOfMagic);
        this.smart = smart;
        this.wisdom = wisdom;
        this.creation = creation;
        this.wit = wit;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Когтевран: " + super.toString()+
                " ум - " + smart +
                " баллов, мудрость - " + wisdom +
                " баллов, творчество - " + creation +
                " баллов, остроумие - " + wit +
                " баллов";
    }

    public int scoreRavenclaw() {
        return super.score() + smart + wisdom + creation + wit;
    }
}
