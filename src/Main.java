public class Main {
    public static void main(String[] args) {

        // Example-1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Example-2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUp);

        // Example-3
        fullName = "Иванов Семён Семёнович";
        String fullNameReplaceE = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameReplaceE);


    }
}