public class Hogwarts {
    private String name;
    private int transgression;
    private int powerOfMagic;

    public Hogwarts(String name, int transgression, int powerOfMagic) {
        this.name = name;
        this.transgression = transgression;
        this.powerOfMagic = powerOfMagic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    //Сравнение двух любых учеников по присущим всем ученикам школы характеристикам

    @Override
    public String toString() {
        return name +
                ", сила магии - " + transgression +
                " баллов, трансгрессия - " + powerOfMagic +
                " баллов,";
    }

    public int score() {
        return transgression + powerOfMagic;
    }

}
