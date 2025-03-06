public class Main {
    public static void main(String[] args) {
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");
        var newNumberOfEmployees = numberOfEmployees + 94;
        var newTotalHours = newNumberOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}