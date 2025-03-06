public class Main {
    public static void main(String[] args) {
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");
    }
}