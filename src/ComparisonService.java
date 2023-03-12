public class ComparisonService {

    public static void comparisonStudents(Gryffindor students1, Gryffindor students2) {
        int sum1 = students1.scoreGryffindor();
        int sum2 = students2.scoreGryffindor();
        if (sum1 > sum2) {
            System.out.println(students1.getName() + " лучший Гриффиндорец, чем " + students2.getName());
        } else {
            System.out.println(students2.getName() + " лучший Гриффиндорец, чем " + students1.getName());
        }
    }

    public static void comparisonStudents(Hufflepuff students1, Hufflepuff students2) {
        int sum1 = students1.scoreHufflepuff();
        int sum2 = students2.scoreHufflepuff();
        if (sum1 > sum2) {
            System.out.println(students1.getName() + " лучший Пуффендуец, чем " + students2.getName());
        } else {
            System.out.println(students2.getName() + " лучший Пуффендуец, чем " + students1.getName());
        }
    }

    public static void comparisonStudents(Ravenclaw students1, Ravenclaw students2) {
        int sum1 = students1.scoreRavenclaw();
        int sum2 = students2.scoreRavenclaw();
        if (sum1 > sum2) {
            System.out.println(students1.getName() + " лучший Когтевранец, чем " + students2.getName());
        } else {
            System.out.println(students2.getName() + " лучший Когтевранец, чем " + students1.getName());
        }
    }

    public static void comparisonStudents(Slytherin students1, Slytherin students2) {
        int sum1 = students1.scoreSlytherin();
        int sum2 = students2.scoreSlytherin();
        if (sum1 > sum2) {
            System.out.println(students1.getName() + " лучший Слизеринец, чем " + students2.getName());
        } else {
            System.out.println(students2.getName() + " лучший Слизеринец, чем " + students1.getName());
        }
    }

    public static void comparisonHogwarts(Hogwarts student1, Hogwarts student2) {
        int magic1 = student1.getPowerOfMagic();
        int magic2 = student2.getPowerOfMagic();
        int trans1 = student1.getTransgression();
        int trans2 = student2.getTransgression();
        if (magic1 > magic2 && trans1 > trans2) {
            System.out.println(student1.getName()+ " обладает бОльшей мощностью магии и трансгрессии, чем "+ student2.getName());
        } else if (magic1 > magic2 && trans1 < trans2) {
            System.out.println(student1.getName()+ " обладает бОльшей мощностью магии и меньшей мощностью трансгрессии, чем "+ student2.getName());
        } else if (magic1 < magic2 && trans1 > trans2) {
            System.out.println(student1.getName() + " обладает меньшей мощностью магии и бОльшей мощностью трансгрессии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName()+ " обладает бОльшей мощностью магии и трансгрессии, чем "+ student1.getName());
        }
    }
    }


