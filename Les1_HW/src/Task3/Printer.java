package Task3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        // Введите свое решение ниже
        int lenA = a.length;
        int lenB = b.length;
        int[] c = {};

        try {
            if(lenA > lenB || lenB > lenA) {
                c = new int[1];
                c[0] = 0;
            }
            else {
                c = new int[lenA];
                for(int i = 0; i <= lenA - 1; i++) {
                    c[i] = a[i] / b[i];
                }
            }
        } catch (RuntimeException e) {
            System.err.println("Произошла ошибка при делении, скорее всего деление на 0");
        }

        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 0};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}