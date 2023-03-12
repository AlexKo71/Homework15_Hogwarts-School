public class Main {
    public static void main(String[] args) {
        System.out.println("Hogwarts School");
        //факультет "Гриффиндор"
        var harry = new Gryffindor("Гарри Поттер", 50, 90, 90, 85, 90);
        var hermione = new Gryffindor("Гермиона Грейнджер", 80, 50, 97, 88, 50);
        var ron = new Gryffindor("Рон Уизли", 30, 45, 80, 70, 80);
        //факультет "Слизерин"
        var draco = new Slytherin("Драко Малфой", 45, 85, 90, 55, 88, 55, 18);
        var graham = new Slytherin("Грэхэм Монтегю", 35, 45, 50, 45, 45, 23, 11);
        var gregory = new Slytherin("Грегори Гойл", 10, 35, 45, 60, 44, 55, 12);
        //факультет "Пуффендуй"
        var zacharias = new Hufflepuff("Захария Смит", 45, 48, 22, 47, 57);
        var cedric = new Hufflepuff("Седрик Диггори", 35, 78, 42, 57, 67);
        var justin = new Hufflepuff("Джастин Финч-Флетчли", 34, 59, 45, 55, 47);
        //факультет "Когтевран"
        var cho = new Ravenclaw("Чжоу Чанг", 47, 45, 33, 56, 23, 34);
        var padma = new Ravenclaw("Падма Патил", 23, 73, 12, 77, 34, 21);
        var marcus = new Ravenclaw("Маркус Белби", 50, 45, 67, 78, 12, 33);


        System.out.println(harry);
        System.out.println(cedric);
        System.out.println(cho);
        System.out.println(draco);
        System.out.println();
        ComparisonService.comparisonStudents(hermione, ron);
        ComparisonService.comparisonStudents(zacharias, justin);
        ComparisonService.comparisonStudents(padma, marcus);
        ComparisonService.comparisonStudents(graham, gregory);
        System.out.println();
        ComparisonService.comparisonHogwarts(zacharias, cho);

    }
}