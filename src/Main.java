public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        // Задача 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("Задача 2:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        // Задача 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Задача 3:");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();

        // Задача 4
        var friend = 19;

        System.out.println("Задача 4:");
        System.out.println("friend = " + friend);

        friend += 2;
        System.out.println("friend after adding 2 = " + friend);

        friend /= 7;
        System.out.println("friend after dividing by 7 = " + friend);
        System.out.println();

        // Задача 5
        var frog = 3.5;

        System.out.println("Задача 5:");
        System.out.println("frog = " + frog);

        frog *= 10;
        System.out.println("frog after multiplying by 10 = " + frog);

        frog /= 3.5;
        System.out.println("frog after dividing by 3.5 = " + frog);

        frog += 4;
        System.out.println("frog after adding 4 = " + frog);
        System.out.println();

        // Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;

        System.out.println("Задача 6:");
        System.out.println("Общая масса двух бойцов = " + totalWeight);
        System.out.println("Разница между массами бойцов = " + weightDifference);
        System.out.println();

        // Задача 7
        var remainder = boxer2 % boxer1;

        System.out.println("Задача 7:");
        System.out.println("Остаток от деления между двумя весами = " + remainder);
        System.out.println();

        // Задача 8
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Задача 8:");
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        var additionalEmployees = 94;
        var newNumberOfEmployees = numberOfEmployees + additionalEmployees;
        var newTotalHours = newNumberOfEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}