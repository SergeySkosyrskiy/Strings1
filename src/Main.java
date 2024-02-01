
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1");

        String firstName = "Ivan";
        String midleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + midleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задача2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача3");
        firstName = "Семён";
        midleName = "Семёнович";
        lastName = "Иванов";
        /*firstName = firstName.replace("ё", "е");
        midleName = midleName.replace("ё", "е");
        lastName = lastName.replace("ё", "е");*/
        fullName = lastName + " " + firstName + " " + midleName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

    }
}