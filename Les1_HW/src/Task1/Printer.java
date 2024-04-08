package Task1;

class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        String[] arr = new String[10];
        arr[11] = "test";

    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 1;
        int b = 0;

        int res = a / b;
    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String str = "123avb56";
        int num = Integer.parseInt(str);
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}